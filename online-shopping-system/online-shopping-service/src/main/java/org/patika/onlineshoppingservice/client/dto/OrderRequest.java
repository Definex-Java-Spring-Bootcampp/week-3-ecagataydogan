package org.patika.onlineshoppingservice.client.dto;

import org.patika.onlineshoppingservice.entity.Product;

public class OrderRequest {
    private Long customerId;
    private Product product;

    public OrderRequest(Long customerId, Product product) {
        this.customerId = customerId;
        this.product = product;
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

