package org.example.hibernate;

import org.example.hibernate.Services.CustomerService;
import org.example.hibernate.bdConfigurator.BDConfigurator;
import org.example.hibernate.tables.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.sql.SQLException;

public class HiberMain {
    public static void main(String[] args) throws SQLException {
        MagicBox magicBox = new MagicBox();
        //magicBox.getProductService().saveProduct(magicBox.getProduct(), "pen", 125.5F);
        /*magicBox.getTransactionService().saveTransaction(magicBox.getTransactions(),
                magicBox.getCustomerService().findCustomer(4),
                magicBox.getProductService().findProduct(2),
                15);*/
        System.out.println(magicBox.getTransactionService().findAllTransactions());
    }
}
