package ru.geekbrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.entity.Product;
import ru.geekbrains.repo.ProductRepo;

import java.util.List;

@Service
public class ProductService {
    private ProductRepo productRepo;

    @Autowired
    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product getProductById(int id) {
        Product product = productRepo.findProductById(id);
        return product;
    }

    public List<Product> getAll() {
        return productRepo.getProductList();
    }

    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }
}
