package org.example.hibernate.Services;

import lombok.NoArgsConstructor;
import org.example.hibernate.dao.implementations.CustomerDAOImpl;
import org.example.hibernate.dao.implementations.ProductDAOImpl;
import org.example.hibernate.tables.Customer;
import org.example.hibernate.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ProductService")
@NoArgsConstructor
public class ProductService {
    @Autowired
    ProductDAOImpl productDAO;

    public Product findProduct(int id){
        return productDAO.findById(id);
    }

    public void saveProduct(Product product, String name, float cost) {
        productDAO.save(product, name, cost);
    }

    public void deleteProduct(Product product) {
        productDAO.delete(product);
    }

    public void updateProduct(Product product) {
        productDAO.update(product);
    }

    public List<Product> findAllProducts() {
        return productDAO.findAll();
    }
}
