package com.example.demo.cqrs.customer.command;

public class TestCustomerCommand extends CustomerCommand {

    public TestCustomerCommand() {
    }

    public TestCustomerCommand(String id) {
        setId(id);
    }

}
