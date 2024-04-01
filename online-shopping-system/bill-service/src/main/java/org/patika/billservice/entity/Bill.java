package org.patika.billservice.entity;

import java.math.BigDecimal;

public class Bill {
    private Long id;
    private Long orderId;
    private BigDecimal price;

    public static Long forBillId = 0L;

    public Bill(Long orderId) {
        this.orderId = orderId;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = forBillId;
        forBillId++;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
