package org.example.hibernate.Services;

import lombok.NoArgsConstructor;
import org.example.hibernate.dao.implementations.CustomerDAOImpl;
import org.example.hibernate.tables.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component ("CustomerService")
@NoArgsConstructor
public class CustomerService {
    @Autowired
    CustomerDAOImpl customerDAO;

    public Customer findCustomer(int id){
        return customerDAO.findById(id);
    }

    public void saveUser(Customer customer, String name) {
        customerDAO.save(customer, name);
    }

    public void deleteUser(Customer customer) {
        customerDAO.delete(customer);
    }

    public void updateUser(Customer customer) {
        customerDAO.update(customer);
    }

    public List<Customer> findAllUsers() {
        return customerDAO.findAll();
    }
}
