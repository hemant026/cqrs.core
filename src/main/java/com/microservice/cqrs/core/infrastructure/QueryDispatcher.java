package com.microservice.cqrs.core.infrastructure;

import java.util.List;

import com.microservice.cqrs.core.domain.BaseEntity;
import com.microservice.cqrs.core.queries.BaseQuery;
import com.microservice.cqrs.core.queries.QueryHandlerMethod;

public interface QueryDispatcher {
    <T extends BaseQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> handler);
    <U extends BaseEntity> List<U> send(BaseQuery query);
}