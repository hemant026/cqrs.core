package com.microservice.cqrs.core.producers;

import com.microservice.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}