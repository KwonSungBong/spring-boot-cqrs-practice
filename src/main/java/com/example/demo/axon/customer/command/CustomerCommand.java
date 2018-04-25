package com.example.demo.axon.customer.command;

import lombok.Data;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.io.Serializable;

@Data
public class CustomerCommand implements Serializable {

    @TargetAggregateIdentifier
    private String id;

}
