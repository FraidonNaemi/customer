package com.khancode.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    public List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCustomer(Customer customer);
    boolean existPersonWithId(Integer id);
    boolean existsPersonWithEmail(String email);
    void deleteCustomerById(Integer id);
    void updateCustomer(Customer update);
}
