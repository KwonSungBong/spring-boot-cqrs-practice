package com.example.demo.controller;

import com.example.demo.document.Customer;
import com.example.demo.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private CustomService customService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String get() {
        List<Customer> list = customService.getList();
        return "get";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String post() {
        customService.save();
        return "post";
    }

}
