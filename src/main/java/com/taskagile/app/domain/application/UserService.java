package com.taskagile.app.domain.application;

import com.taskagile.app.domain.application.commands.RegistrationCommand;
import com.taskagile.app.domain.model.user.RegistrationException;

public interface UserService {
  void register(RegistrationCommand command) throws RegistrationException;
}
