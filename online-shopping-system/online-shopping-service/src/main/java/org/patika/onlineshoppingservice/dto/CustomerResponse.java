package org.patika.onlineshoppingservice.dto;

import org.patika.onlineshoppingservice.entity.Order;

import java.util.List;

public class CustomerResponse {
    private String name;
    private int age;
    private List<Order> orders;

    public CustomerResponse(String name, int age, List<Order> orders) {
        this.name = name;
        this.age = age;
        this.orders = orders;
    }

    public CustomerResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
