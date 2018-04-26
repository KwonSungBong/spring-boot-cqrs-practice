package com.example.demo.cqrs.customer.event;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerEvent implements Serializable {

    private String id;

}
