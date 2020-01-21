package ru.geekbrains;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductsOrderedId implements Serializable{
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "customer_id")
    private Long customerId;

    public ProductsOrderedId(Long productId, Long customerId) {
        this.productId = productId;
        this.customerId = customerId;
    }

    public ProductsOrderedId() {

    }

    public Long getProductId() {
        return productId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
