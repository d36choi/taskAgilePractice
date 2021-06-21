package com.taskagile.app.domain.model.user.events;

import com.taskagile.app.domain.common.event.DomainEvent;
import com.taskagile.app.domain.model.user.User;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.util.Assert;

@ToString @EqualsAndHashCode
public class UserRegisteredEvent extends DomainEvent {
  private User user;

  public UserRegisteredEvent(User user) {
    super(user);
    Assert.notNull(user, "Parameter `user` must not be null");
    this.user = user;
  }

  public User getUser() {
    return this.user;
  }

}
