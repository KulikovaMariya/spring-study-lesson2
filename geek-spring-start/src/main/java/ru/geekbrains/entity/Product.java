package ru.geekbrains.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_title")
    private String title;

    @Column(name = "product_cost")
    private Long cost;

//    @ManyToMany
//    @JoinTable(name = "products_ordered",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "customer_id"))
//    private List<Customer> customersOrderedProductList;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductsOrdered> customersOrderedProduct = new ArrayList<>();

    public Product() {
    }

    public Product(String title, Long cost) {
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Long getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

//    public List<Customer> getCustomersOrderedProductList() {
//        return customersOrderedProductList;
//    }
//
//    public void setCustomersOrderedProductList(List<Customer> customersOrderedProductList) {
//        this.customersOrderedProductList = customersOrderedProductList;
//    }


    public List<ProductsOrdered> getCustomersOrderedProduct() {
        return customersOrderedProduct;
    }

    public void setCustomersOrderedProduct(List<ProductsOrdered> customersOrderedProduct) {
        this.customersOrderedProduct = customersOrderedProduct;
    }
}
