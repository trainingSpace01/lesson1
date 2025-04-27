package org.example.hibernate.dao.implementations;

import org.example.hibernate.dao.interfaces.CustomerDAO;
import org.example.hibernate.sessionFactory.SessionFactoryUtil;
import org.example.hibernate.tables.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public  Customer findById(int id) {
       return SessionFactoryUtil.getSessionFactory().openSession().get(Customer.class, id);
    }

    @Override
    public void save(Customer customer, String name) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        customer.setName(name);
        session.save(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Customer customer) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Customer customer) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Customer> findAll() {
        return (List<Customer>)  SessionFactoryUtil.getSessionFactory().openSession().createQuery("From Customer").list();
    }
}
