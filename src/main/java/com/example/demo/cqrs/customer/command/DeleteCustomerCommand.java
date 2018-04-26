package com.example.demo.cqrs.customer.command;

public class DeleteCustomerCommand extends CustomerCommand {

    public DeleteCustomerCommand() {
    }

    public DeleteCustomerCommand(String id) {
        setId(id);
    }

}
