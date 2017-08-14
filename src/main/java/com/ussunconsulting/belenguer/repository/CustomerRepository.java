package com.ussunconsulting.belenguer.repository;

import com.ussunconsulting.belenguer.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
