package org.example.hibernate.dao.interfaces;

import org.example.hibernate.tables.Customer;
import org.example.hibernate.tables.Product;
import org.example.hibernate.tables.Transactions;

import java.util.List;

public interface TransactionsDAO {
    Transactions findById(int id);
    void save(Transactions transactions, Customer customer, Product product, int quantity);
    void update(Transactions transactions);
    void delete(Transactions transactions);
    List<Transactions> findAll();
}
