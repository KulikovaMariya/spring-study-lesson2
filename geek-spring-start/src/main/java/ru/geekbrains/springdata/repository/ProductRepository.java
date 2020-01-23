package ru.geekbrains.springdata.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.entity.Product;

import java.util.List;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Long>{
    List<Product> findByTitle(String title);
    List<Product> findByCostLessThanEqualAndCostGreaterThanEqual(Long maxCost, Long minCost);
    List<Product> findByCostLessThanEqual(Long maxCost);
    List<Product> findByCostGreaterThanEqual(Long minCost);
}
