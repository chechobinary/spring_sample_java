package com.ussunconsulting.belenguer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.ussunconsulting.belenguer"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        service.setCustomerRepository(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
//        return service;
//    }



//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }


}
