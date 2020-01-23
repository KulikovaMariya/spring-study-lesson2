package ru.geekbrains.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.entity.Product;
import ru.geekbrains.springdata.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service("productService")
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    @Qualifier("productRepository")
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Product> get(Long id) {
        return productRepository.findById(id);
    }

    @Transactional
    public void save(Product product) {
        productRepository.save(product);
    }

    @Transactional
    public List<Product> getProductByTitle(String title) {
        return productRepository.findByTitle(title);
    }

    @Transactional
    public List<Product> findByCostLessThanEqual(Long maxCost) {
        return productRepository.findByCostLessThanEqual(maxCost);
    }

    @Transactional
    public List<Product> findByCostLessThanEqualAndCostGreaterThanEqual(Long maxCost, Long minCost) {
        return productRepository.findByCostLessThanEqualAndCostGreaterThanEqual(maxCost, minCost);
    }

    @Transactional
    public List<Product> findByCostGreaterThanEqual(Long minCost) {
        return productRepository.findByCostGreaterThanEqual(minCost);
    }
}
