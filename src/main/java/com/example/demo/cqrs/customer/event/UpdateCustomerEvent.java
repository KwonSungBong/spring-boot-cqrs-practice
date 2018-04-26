package com.example.demo.cqrs.customer.event;

public class UpdateCustomerEvent extends CustomerEvent {

    public UpdateCustomerEvent() {
    }

    public UpdateCustomerEvent(String id) {
        setId(id);
    }

}
