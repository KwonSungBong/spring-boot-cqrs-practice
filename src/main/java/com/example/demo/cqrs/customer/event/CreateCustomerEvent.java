package com.example.demo.cqrs.customer.event;

public class CreateCustomerEvent extends CustomerEvent {

    public CreateCustomerEvent() {
    }

    public CreateCustomerEvent(String id) {
        setId(id);
    }

}
