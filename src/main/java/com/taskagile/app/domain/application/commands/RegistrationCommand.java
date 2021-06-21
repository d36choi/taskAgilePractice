package com.taskagile.app.domain.application.commands;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.util.Assert;

@Getter
@EqualsAndHashCode
public class RegistrationCommand {
  public String username;
  public String emailAddress;
  public String password;

  public RegistrationCommand(String username, String emailAddress, String password) {
    Assert.hasText(username, "Parameter `username` must not be empty");
    Assert.hasText(emailAddress, "Parameter `emailAddress` must not be empty");
    Assert.hasText(password, "Parameter `password` must not be empty");
    this.username = username;
    this.emailAddress = emailAddress;
    this.password = password;
  }
}
