package com.example.demo.cqrs.customer.handler;

import com.example.demo.cqrs.customer.command.TestCustomerCommand;
import com.example.demo.cqrs.customer.event.TestCustomerEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.springframework.stereotype.Component;

@Component
public class CustomerCommandHandler {

    @CommandHandler
    public void testCustomerCommand(TestCustomerCommand command) {
        AggregateLifecycle.apply(new TestCustomerEvent(command.getId()));
    }

}
