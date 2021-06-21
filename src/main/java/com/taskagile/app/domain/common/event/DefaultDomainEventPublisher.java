package com.taskagile.app.domain.common.event;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DefaultDomainEventPublisher implements DomainEventPublisher {

  private final ApplicationEventPublisher actualPublisher;

  @Override
  public void publish(DomainEvent event) {
    actualPublisher.publishEvent(event);
  }

}
