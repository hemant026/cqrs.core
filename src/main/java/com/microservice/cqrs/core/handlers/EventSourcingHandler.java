package com.microservice.cqrs.core.handlers;

import com.microservice.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {
    void save(AggregateRoot aggregate);
    T getById(String id);
    void republishEvents();
}