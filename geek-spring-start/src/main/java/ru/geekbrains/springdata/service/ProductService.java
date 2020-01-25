package ru.geekbrains.springdata.service;

import ru.geekbrains.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();

    Optional<Product> get(Long id);

    void save(Product article);

    List<Product> getProductByTitle(String title);

    public List<Product> findByCostLessThanEqual(Long maxCost);

    List<Product> findByCostLessThanEqualAndCostGreaterThanEqual(Long maxCost, Long minCost);

    List<Product> findByCostGreaterThanEqual(Long minCost);
}
