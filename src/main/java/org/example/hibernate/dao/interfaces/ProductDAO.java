package org.example.hibernate.dao.interfaces;

import org.example.hibernate.tables.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductDAO {

    Product findById(int id);
    void save(Product product, String name, float cost);
    void update(Product product);
    void delete(Product product);
    List<Product> findAll();
}
