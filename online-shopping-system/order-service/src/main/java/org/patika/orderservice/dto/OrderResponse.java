package org.patika.orderservice.dto;

import org.patika.orderservice.entity.Product;

public class OrderResponse {

    private Long id;
    private Long customerId;
    private Product product;

    public OrderResponse(Long id, Long customerId, Product product) {
        this.id = id;
        this.customerId = customerId;
        this.product = product;
    }

    public OrderResponse() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
