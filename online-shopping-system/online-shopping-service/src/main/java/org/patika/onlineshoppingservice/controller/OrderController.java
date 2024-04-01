package org.patika.onlineshoppingservice.controller;

import org.patika.onlineshoppingservice.client.OrderServiceClient;
import org.patika.onlineshoppingservice.client.dto.OrderRequest;
import org.patika.onlineshoppingservice.client.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {

    private final OrderServiceClient orderServiceClient;

    @Autowired
    public OrderController(OrderServiceClient orderServiceClient) {
        this.orderServiceClient = orderServiceClient;
    }

    @PostMapping
    public OrderResponse save(@RequestBody OrderRequest orderRequest){
        return orderServiceClient.save(orderRequest);
    }

    @GetMapping
    public List<OrderResponse> findAll() {
        return orderServiceClient.findAll();
    }


}
