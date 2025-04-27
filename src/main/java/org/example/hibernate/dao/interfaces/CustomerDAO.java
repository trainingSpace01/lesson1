package org.example.hibernate.dao.interfaces;

import org.example.hibernate.tables.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerDAO {
    Customer findById(int id);
    void save(Customer customer, String name);
    void update(Customer customer);
    void delete(Customer customer);
    List<Customer> findAll();
}
