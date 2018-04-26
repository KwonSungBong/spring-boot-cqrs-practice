package com.example.demo.test;

import com.example.demo.cqrs.customer.command.CreateCustomerCommand;
import com.example.demo.cqrs.customer.command.DeleteCustomerCommand;
import com.example.demo.cqrs.customer.command.TestCustomerCommand;
import com.example.demo.cqrs.customer.command.UpdateCustomerCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandTests {

	@Autowired
	private CommandGateway commandGateway;

	@Test
	public void TEST1() {
		commandGateway.send(new CreateCustomerCommand("TSET"));
	}

    @Test
    public void TEST2() {
        commandGateway.send(new CreateCustomerCommand("TSET"));
        commandGateway.send(new UpdateCustomerCommand("TSET"));
    }

    @Test
    public void TEST3() {
        commandGateway.send(new CreateCustomerCommand("TSET"));
        commandGateway.send(new DeleteCustomerCommand("TSET"));
    }

    @Test
    public void TEST4() {
        commandGateway.send(new CreateCustomerCommand("TSET"));
        commandGateway.send(new TestCustomerCommand("TSET"));
    }

}
