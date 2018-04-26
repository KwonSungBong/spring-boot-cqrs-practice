package com.example.demo.controller;

import com.example.demo.cqrs.customer.command.CreateCustomerCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class CommandController {

    @Autowired
    private CommandGateway commandGateway;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        commandGateway.send(new CreateCustomerCommand("TSET"));
        return "test";
    }

}
