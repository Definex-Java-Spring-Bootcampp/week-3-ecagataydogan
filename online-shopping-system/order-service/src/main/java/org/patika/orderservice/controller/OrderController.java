package org.patika.orderservice.controller;


import org.patika.orderservice.dto.OrderRequest;
import org.patika.orderservice.dto.OrderResponse;
import org.patika.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderResponse save(@RequestBody OrderRequest orderRequest) {
        return orderService.save(orderRequest);
    }

    @GetMapping
    public List<OrderResponse> findAll() {
        return orderService.findAll();

    }

}
