package org.patika.billservice.dto;

import org.patika.billservice.entity.Product;

import java.math.BigDecimal;

public class BillDTO {
    private Long orderId;
    private Product product;
    private BigDecimal price;



    public BillDTO(Long orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
        this.price = product.getPrice();
    }

    public BillDTO() {

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
