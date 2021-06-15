package com.taskagile.app.domain.application.commands;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor @Getter
@EqualsAndHashCode
public class RegistrationCommand {
  public String username;
  public String emailAddress;
  public String password;

}
