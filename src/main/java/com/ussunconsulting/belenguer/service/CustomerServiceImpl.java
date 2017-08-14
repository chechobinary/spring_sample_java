package com.ussunconsulting.belenguer.service;

import com.ussunconsulting.belenguer.model.Customer;
import com.ussunconsulting.belenguer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {};

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println(" --> Using Constructor injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println(" --> Using Setter injection");
        this.customerRepository = customerRepository;
    }

}
