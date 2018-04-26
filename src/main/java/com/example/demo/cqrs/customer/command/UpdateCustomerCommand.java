package com.example.demo.cqrs.customer.command;

public class UpdateCustomerCommand extends CustomerCommand {

    public UpdateCustomerCommand() {
    }

    public UpdateCustomerCommand(String id) {
        setId(id);
    }

}
