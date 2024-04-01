package org.patika.orderservice.producer.dto;

import org.patika.orderservice.entity.Product;

public class BillDTO {
    private Long orderId;
    private Product product;

    public BillDTO(Long orderId,Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
