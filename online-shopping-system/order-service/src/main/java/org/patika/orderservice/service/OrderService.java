package org.patika.orderservice.service;

import org.patika.orderservice.dto.OrderRequest;
import org.patika.orderservice.dto.OrderResponse;
import org.patika.orderservice.entity.Order;
import org.patika.orderservice.producer.BillProducer;
import org.patika.orderservice.producer.dto.BillDTO;
import org.patika.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository = new OrderRepository();

    private final BillProducer billProducer;

    public OrderService(BillProducer billProducer) {
        this.billProducer = billProducer;
    }

    public OrderResponse save(OrderRequest orderRequest) {
        OrderResponse orderResponse = orderRepository.save(orderRequest);
        BillDTO billDTO = new BillDTO(orderResponse.getId(),orderResponse.getProduct());
        billDTO.getProduct().getPrice();
        billProducer.sendNotification(billDTO);
        return orderResponse;
    }

    public List<OrderResponse> findAll() {
        return orderRepository.findAll();
    }


}
