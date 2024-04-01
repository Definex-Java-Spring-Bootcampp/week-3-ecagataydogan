package org.patika.billservice.listener;

import org.patika.billservice.dto.BillDTO;
import org.patika.billservice.entity.Bill;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class BillListener {
    @RabbitListener(queues = "${rabbitmq.queue}")
    public void createBill(BillDTO billDTO) {
        Bill toSaveBill = new Bill(billDTO.getOrderId());
        toSaveBill.setId();
        System.out.println(billDTO.getPrice());
        toSaveBill.setPrice(billDTO.getProduct().getPrice());
        System.out.println("Bill ID: " + toSaveBill.getId() + " " + "OrderId: " + toSaveBill.getOrderId() + "Bill price: " + toSaveBill.getPrice());
    }
}
