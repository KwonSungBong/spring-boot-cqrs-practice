package com.example.demo.cqrs.customer.command;

public class CreateCustomerCommand extends CustomerCommand {

    public CreateCustomerCommand() {
    }

    public CreateCustomerCommand(String id) {
        setId(id);
    }

}
