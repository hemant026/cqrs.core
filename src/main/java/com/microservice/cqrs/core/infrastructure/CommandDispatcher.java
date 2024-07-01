package com.microservice.cqrs.core.infrastructure;

import com.microservice.cqrs.core.commands.BaseCommand;
import com.microservice.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}