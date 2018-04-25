package com.example.demo.axon.customer.config;

import com.example.demo.axon.customer.CustomerAggregate;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Bean
    public EventSourcingRepository<CustomerAggregate> customerEventSourcingRepository(EventStore eventStore) {
        EventSourcingRepository<CustomerAggregate> repository = new EventSourcingRepository(CustomerAggregate, eventStore);
        return repository;
    }

}
