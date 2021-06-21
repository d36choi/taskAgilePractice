package com.taskagile.app.domain.common.event;

import org.springframework.context.ApplicationEvent;

public abstract class DomainEvent extends ApplicationEvent {

  public DomainEvent(Object source) {
    super(source);
  }

  /**
   * Get the timestamp this event occurred
   */
  public long occurredAt() {
    // Return the underlying implementation's timestamp
    return getTimestamp();
  }
}
