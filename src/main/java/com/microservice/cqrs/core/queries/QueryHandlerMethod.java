package com.microservice.cqrs.core.queries;

import java.util.List;

import com.microservice.cqrs.core.domain.BaseEntity;

@FunctionalInterface
public interface QueryHandlerMethod<T extends BaseQuery> {
    List<BaseEntity> handle(T query);
}