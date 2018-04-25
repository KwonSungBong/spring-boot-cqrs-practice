package com.example.demo.axon.customer;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.io.Serializable;

@Aggregate
public class CustomerAggregate implements Serializable {

    private static final long serialVersionUID = 1L;

    @AggregateIdentifier
    public String id;

    public String firstName;
    public String lastName;

}
