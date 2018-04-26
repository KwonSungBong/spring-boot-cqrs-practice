package com.example.demo.cqrs.customer;

import com.example.demo.cqrs.customer.command.CreateCustomerCommand;
import com.example.demo.cqrs.customer.command.DeleteCustomerCommand;
import com.example.demo.cqrs.customer.command.UpdateCustomerCommand;
import com.example.demo.cqrs.customer.event.CreateCustomerEvent;
import com.example.demo.cqrs.customer.event.CustomerEvent;
import com.example.demo.cqrs.customer.event.DeleteCustomerEvent;
import com.example.demo.cqrs.customer.event.UpdateCustomerEvent;
import lombok.Data;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Aggregate
public class CustomerAggregate implements Serializable {

    private static final long serialVersionUID = 1L;

    @AggregateIdentifier
    public String id;

    public String firstName;
    public String lastName;

    public CustomerAggregate() {
    }

    @CommandHandler
    public CustomerAggregate(CreateCustomerCommand command) {
        AggregateLifecycle.apply(new CreateCustomerEvent(command.getId()));
    }

    @CommandHandler
    public void on(UpdateCustomerCommand command) {
        AggregateLifecycle.apply(new UpdateCustomerEvent(command.getId()));
    }

    @CommandHandler
    public void on(DeleteCustomerCommand command) {
        AggregateLifecycle.apply(new DeleteCustomerEvent(command.getId()));
    }

    @EventSourcingHandler
    public void on(CreateCustomerEvent event) {
        this.id = event.getId();
    }

    @EventSourcingHandler
    public void on(UpdateCustomerEvent event) {
        this.id = event.getId();
    }

    @EventSourcingHandler
    public void on(DeleteCustomerEvent event) {
        this.id = event.getId();
    }

}
