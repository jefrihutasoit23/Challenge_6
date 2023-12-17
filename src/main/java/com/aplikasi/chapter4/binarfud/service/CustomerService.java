package com.aplikasi.chapter4.binarfud.service;

import com.aplikasi.chapter4.binarfud.entity.Customer;

import java.util.Map;

public interface CustomerService {
    Map addCustomer(Customer customer);
    Map updateCustomer(Customer customer);
    Map deleteCustomer(Customer customer);
    Map getByID(Long user);
}

