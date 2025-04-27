package org.example.hibernate.dao.implementations;

import org.example.hibernate.dao.interfaces.TransactionsDAO;
import org.example.hibernate.sessionFactory.SessionFactoryUtil;
import org.example.hibernate.tables.Customer;
import org.example.hibernate.tables.Product;
import org.example.hibernate.tables.Transactions;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class TransactionsDAOImpl implements TransactionsDAO {
    @Override
    public Transactions findById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(Transactions.class, id);
    }

    @Override
    public void save(Transactions transactions, Customer customer, Product product, int quantity) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        transactions.setCustomer(customer);
        transactions.setProduct(product);
        transactions.setQuantity(quantity);
        session.save(transactions);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Transactions transactions) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(transactions);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Transactions transactions) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(transactions);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Transactions> findAll() {
        return (List<Transactions>)  SessionFactoryUtil.getSessionFactory().openSession().createQuery("From Transactions").list();
    }
}
