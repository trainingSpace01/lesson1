package org.example.hibernate.dao.implementations;

import org.example.hibernate.dao.interfaces.ProductDAO;
import org.example.hibernate.sessionFactory.SessionFactoryUtil;
import org.example.hibernate.tables.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDAOImpl implements ProductDAO {
    @Override
    public Product findById(int id) {
        return SessionFactoryUtil.getSessionFactory().openSession().get(Product.class, id);
    }

    @Override
    public void save(Product product, String name, float cost) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        product.setName(name);
        product.setCost(cost);
        session.save(product);
        tx1.commit();
        session.close();

    }

    @Override
    public void update(Product product) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(product);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Product product) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(product);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = (List<Product>)  SessionFactoryUtil.getSessionFactory().openSession().createQuery("From Product").list();
        return products;
    }
}
