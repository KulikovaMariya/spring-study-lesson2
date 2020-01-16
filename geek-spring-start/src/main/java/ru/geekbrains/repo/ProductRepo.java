package ru.geekbrains.repo;

import org.springframework.stereotype.Component;
import ru.geekbrains.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepo {
    private List<Product> productList;

    public ProductRepo() {
        productList = new ArrayList<Product>();
        productList.add(new Product(123, "vine", 10));
        productList.add(new Product(124, "beer", 2));
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product findProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
