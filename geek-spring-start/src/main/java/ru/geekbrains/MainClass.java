package ru.geekbrains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<ProductsOrdered> customerList = dao.getCustomersOrderedProductById(1L);
        for (ProductsOrdered productsOrdered : customerList) {
            System.out.println("cost"  + " " + productsOrdered.getCost());
            System.out.println("date"  + " " + productsOrdered.getDate());
        }
        dao.close();
    }
}
