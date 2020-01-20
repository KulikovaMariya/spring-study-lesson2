package ru.geekbrains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Customer> customerList = dao.getCustomersOrderedProductById(1L);
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerName());
        }
        dao.close();
    }
}
