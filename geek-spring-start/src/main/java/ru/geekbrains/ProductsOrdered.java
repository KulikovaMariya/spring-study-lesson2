package ru.geekbrains;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products_ordered")
public class ProductsOrdered {
    @EmbeddedId
    private ProductsOrderedId productsOrderedId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("customerId")
    private Customer customer;

    @Column(name = "cost")
    private Long cost;

    @Column(name = "date")
    private Date date;

    public ProductsOrdered() {
    }

    public ProductsOrdered(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
        this.productsOrderedId = new ProductsOrderedId(product.getId(), customer.getId());
    }

    public ProductsOrderedId getProductsOrderedId() {
        return productsOrderedId;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Long getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }

    public void setProductsOrderedId(ProductsOrderedId productsOrderedId) {
        this.productsOrderedId = productsOrderedId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
