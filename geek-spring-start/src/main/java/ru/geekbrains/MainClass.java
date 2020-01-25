package ru.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.entity.Product;
import ru.geekbrains.entity.ProductsOrdered;
import ru.geekbrains.springdata.service.ProductService;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
//        List<Product> products = productService.getAll();
//        for (Product p : products) {
//            System.out.println(p.getTitle());
//        }
        List<Product> products = productService.findByCostLessThanEqual(22L);
        for (Product p : products) {
            System.out.println(p.getCost());
        }

    }
}
