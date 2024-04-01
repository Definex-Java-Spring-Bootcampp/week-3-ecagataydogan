package org.patika.onlineshoppingservice.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Long id;
    private String name;
    private int age;
    private List<Order> orders;

    public static Long forIdCount = 0L;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.orders = new ArrayList<>();
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        forIdCount++;
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
