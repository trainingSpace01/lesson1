package org.example.hibernate;

import lombok.Getter;
import org.example.hibernate.Services.CustomerService;
import org.example.hibernate.Services.ProductService;
import org.example.hibernate.Services.TransactionService;
import org.example.hibernate.bdConfigurator.BDConfigurator;
import org.example.hibernate.tables.Customer;
import org.example.hibernate.tables.Product;
import org.example.hibernate.tables.Transactions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Getter
public class MagicBox {
    private CustomerService customerService;
    private ProductService productService;
    private TransactionService transactionService;
    private Customer customer;
    private Transactions transactions;
    private Product product;
    ApplicationContext context;

    public MagicBox(){
        this.context = new
                AnnotationConfigApplicationContext(BDConfigurator.class);
        this.customerService = context.getBean("CustomerService", CustomerService.class);
        this.productService = context.getBean("ProductService", ProductService.class);
        this.transactionService = context.getBean("TransactionService", TransactionService.class);
        this.customer = context.getBean("Customer", Customer.class);
        this.product = context.getBean("Product", Product.class);
        this.transactions = context.getBean("Transactions", Transactions.class);
    }
}
