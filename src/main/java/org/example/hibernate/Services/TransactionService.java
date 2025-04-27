package org.example.hibernate.Services;

import lombok.NoArgsConstructor;
import org.example.hibernate.dao.implementations.ProductDAOImpl;
import org.example.hibernate.dao.implementations.TransactionsDAOImpl;
import org.example.hibernate.tables.Customer;
import org.example.hibernate.tables.Product;
import org.example.hibernate.tables.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("TransactionService")
@NoArgsConstructor
public class TransactionService {

    @Autowired
    TransactionsDAOImpl transactionsDAO;

    public Transactions findCustomer(int id){
        return transactionsDAO.findById(id);
    }

    public void saveTransaction(Transactions transactions, Customer customer, Product product, int quantity) {
        transactionsDAO.save(transactions, customer, product, quantity);
    }

    public void deleteTransaction(Transactions transactions) {
        transactionsDAO.delete(transactions);
    }

    public void updateTransaction(Transactions transactions) {
        transactionsDAO.update(transactions);
    }

    public List<Transactions> findAllTransactions() {
        return transactionsDAO.findAll();
    }

}
