package ru.geekbrains;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String customerName;

    @ManyToMany
    @JoinTable(name = "products_ordered",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> orderedProductsList;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderedProductsList(List<Product> orderedProductsList) {
        this.orderedProductsList = orderedProductsList;
    }

    public List<Product> getOrderedProductsList() {
        return orderedProductsList;
    }
}
