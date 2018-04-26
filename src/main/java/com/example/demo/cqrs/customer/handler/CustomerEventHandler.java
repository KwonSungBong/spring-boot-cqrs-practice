package com.example.demo.cqrs.customer.handler;

import com.example.demo.cqrs.customer.CustomerAggregate;
import com.example.demo.cqrs.customer.event.CustomerEvent;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventHandler {

    @Autowired
    @Qualifier("customerEventSourcingRepository")
    private EventSourcingRepository<CustomerAggregate> customerEventSourcingRepository;

    @EventSourcingHandler
    void on(CustomerEvent event) {
        CustomerAggregate customerAggregate = loadAggregate(event);

        System.out.println("TESTTESTTESTTESTTESTTESTTESTTEST");
    }

    private CustomerAggregate loadAggregate(CustomerEvent event) {
        return customerEventSourcingRepository.load(event.getId())
                .getWrappedAggregate().getAggregateRoot();
    }

}
