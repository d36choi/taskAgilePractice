package com.taskagile.app.domain.common.event;

public interface DomainEventPublisher {

  void publish(DomainEvent event);

}
