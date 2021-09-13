package com.example.ui_takeloan.service;

import com.example.ui_takeloan.domain.Customer;
import com.example.ui_takeloan.domain.IdType;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerService {

    private Set customers;
    private static CustomerService customerService;

    private CustomerService(){
        this.customers = exampleData();
    }

    public static CustomerService getInstance(){
        if (customerService == null){
            customerService = new CustomerService();
        }
        return customerService;
    }

    public Set getCustomers() {
        return new HashSet<>(customers);
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    private Set exampleData(){
        Set dummyCustomers = new HashSet();
        dummyCustomers.add(new Customer(1L, "adam", "surname", "+48 8858", "street", "lok. 858/85", "00-85", "Krakow", "85885558", "888-888-55-55", IdType.POLISH_ID,"aaa857496" ,"mail@mail.com" ,true , LocalDate.of(2021,5,5) ,null ));
        dummyCustomers.add(new Customer(2L, "krzysiek", "surname", "+48 8858", "street", "lok. 858/85", "00-85", "Krakow", "85885558", "888-888-55-55",IdType.PASSPORT,"aaa857496" ,"test@mai.pl" ,true , LocalDate.of(2021,5,5) ,null ));
        return dummyCustomers;
    }

    public Collection<Customer> findByName(String name) {
//        return (Collection<Customer>) customers.stream().filter(customers->customers.getClass().getName().contains(name)).collect(Collectors.toSet());
        return (Collection<Customer>) customers.stream().filter( customers -> customers.getClass().getName().contains(name)).collect(Collectors.toSet());
    }


    public void save(Customer customer) {
        this.customers.add(customer);
    }

    public void delete(Customer customer) {
        this.customers.remove(customer);
    }




}
