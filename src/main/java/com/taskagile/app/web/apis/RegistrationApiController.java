package com.taskagile.app.web.apis;

import com.taskagile.app.domain.application.UserService;
import com.taskagile.app.domain.model.user.EmailAddressExistsException;
import com.taskagile.app.domain.model.user.RegistrationException;
import com.taskagile.app.domain.model.user.UsernameExistsException;
import com.taskagile.app.web.results.ApiResult;
import com.taskagile.app.web.results.Result;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.taskagile.app.web.payload.RegistrationPayload;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
public class RegistrationApiController {

  UserService userService;

  @PostMapping("/api/registrations")
  public ResponseEntity<ApiResult> register(@Valid @RequestBody RegistrationPayload payload) {
    try {
      userService.register(payload.toCommand());
      return Result.created();
    } catch (RegistrationException e) {
      String errorMessage = "Registration failed";
      if (e instanceof UsernameExistsException) {
        errorMessage = "Username already exists";
      } else if (e instanceof EmailAddressExistsException) {
        errorMessage = "Email address already exists";
      }
      return Result.failure(errorMessage);
    }
  }
}
