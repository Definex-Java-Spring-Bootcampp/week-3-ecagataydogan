package org.patika.orderservice.entity;

import java.util.List;

public class Order {

    private Long id;
    private Long customerId;
    private Product product;

    public static Long idCounter = 0L;

    public Order(Long customerId, Product product) {
        this.customerId = customerId;
        this.product = product;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        idCounter++;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
