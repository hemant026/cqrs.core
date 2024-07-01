package com.microservice.cqrs.core.infrastructure;

import java.util.List;

import com.microservice.cqrs.core.events.BaseEvent;

public interface EventStore {
    void saveEvent(String aggregateId, Iterable<BaseEvent> events, int expectedVersion);
    List<BaseEvent> getEvents(String aggregateId);

    List<String> getAggregateIds();
}