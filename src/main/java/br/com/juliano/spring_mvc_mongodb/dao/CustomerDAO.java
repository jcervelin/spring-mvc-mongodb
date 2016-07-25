package br.com.juliano.spring_mvc_mongodb.dao;

import java.util.List;

import br.com.juliano.spring_mvc_mongodb.model.Customer;

public interface CustomerDAO {
    public void addCustomer(Customer customer);
    public List<Customer> listCustomer();
    public void deleteCustomer(Customer customer);
    public void updateCustomer(Customer customer);
}