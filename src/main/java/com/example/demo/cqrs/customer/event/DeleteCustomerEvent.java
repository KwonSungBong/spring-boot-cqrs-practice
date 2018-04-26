package com.example.demo.cqrs.customer.event;

public class DeleteCustomerEvent extends CustomerEvent {

    public DeleteCustomerEvent() {
    }

    public DeleteCustomerEvent(String id) {
        setId(id);
    }

}
