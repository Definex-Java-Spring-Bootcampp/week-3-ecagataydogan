package org.patika.onlineshoppingservice.client;


import org.patika.onlineshoppingservice.client.dto.OrderRequest;
import org.patika.onlineshoppingservice.client.dto.OrderResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "order-service", url = "localhost:8081")
public interface OrderServiceClient {
    @PostMapping("api/v1/orders")
    OrderResponse save(@RequestBody OrderRequest orderRequest);

    @GetMapping("api/v1/orders")
    List<OrderResponse> findAll();

}
