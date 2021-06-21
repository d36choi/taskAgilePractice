package com.taskagile.app.domain.common.event;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DefaultDomainEventPublisher implements DomainEventPublisher {

  private ApplicationEventPublisher actualPublisher;

  public DefaultDomainEventPublisher(ApplicationEventPublisher actualPublisher) {
    this.actualPublisher = actualPublisher;
  }

  @Override
  public void publish(DomainEvent event) {
    actualPublisher.publishEvent(event);
  }

}
