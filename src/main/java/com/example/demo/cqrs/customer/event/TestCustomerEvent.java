package com.example.demo.cqrs.customer.event;

public class TestCustomerEvent extends CustomerEvent {

    public TestCustomerEvent() {
    }

    public TestCustomerEvent(String id) {
        setId(id);
    }

}
