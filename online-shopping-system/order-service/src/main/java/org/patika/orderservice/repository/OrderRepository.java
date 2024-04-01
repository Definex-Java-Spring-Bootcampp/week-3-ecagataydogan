package org.patika.orderservice.repository;

import org.patika.orderservice.dto.OrderRequest;
import org.patika.orderservice.dto.OrderResponse;
import org.patika.orderservice.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public OrderResponse save(OrderRequest orderRequest) {
        Order toSaveOrder = new Order();
        toSaveOrder.setProduct(orderRequest.getProduct());
        toSaveOrder.setCustomerId(orderRequest.getCustomerId());
        toSaveOrder.setId(Order.idCounter);
        orders.add(toSaveOrder);
        System.out.println(Order.idCounter);
        OrderResponse savedOrder = new OrderResponse();
        savedOrder.setCustomerId(toSaveOrder.getCustomerId());
        savedOrder.setProduct(toSaveOrder.getProduct());
        savedOrder.setId(toSaveOrder.getId());
        return savedOrder;
    }

    public List<OrderResponse> findAll() {
        List<OrderResponse> orderResponses = new ArrayList<>();
        for(Order order : orders) {
            orderResponses.add(convertOrderToResponse(order));
        }
        return orderResponses;
    }

    private OrderResponse convertOrderToResponse(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(order.getId());
        orderResponse.setProduct(order.getProduct());
        orderResponse.setCustomerId(order.getCustomerId());
        return orderResponse;

    }
}
