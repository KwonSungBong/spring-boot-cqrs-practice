package com.example.demo.service;

import com.example.demo.document.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getList() {
        return customerRepository.findAll();
    }

    public void save() {
        Customer customer = new Customer("Kwon", "Sungbong");
        customerRepository.save(customer);
    }

}
