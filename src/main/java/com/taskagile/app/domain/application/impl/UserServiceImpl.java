package com.taskagile.app.domain.application.impl;

import com.taskagile.app.domain.application.UserService;
import com.taskagile.app.domain.application.commands.RegistrationCommand;
import com.taskagile.app.domain.model.user.RegistrationException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public void register(RegistrationCommand command) throws RegistrationException {

  }

}
