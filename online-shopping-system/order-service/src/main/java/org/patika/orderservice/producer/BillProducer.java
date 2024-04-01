package org.patika.orderservice.producer;

import org.patika.orderservice.configuration.RabbitMQConfiguration;
import org.patika.orderservice.producer.dto.BillDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillProducer {

    private final RabbitMQConfiguration rabbitMQConfiguration;
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public BillProducer(RabbitMQConfiguration rabbitMQConfiguration, AmqpTemplate amqpTemplate) {
        this.rabbitMQConfiguration = rabbitMQConfiguration;
        this.amqpTemplate = amqpTemplate;
    }

    public void sendNotification(BillDTO billDTO) {
        System.out.println("notification sent: {}");
        amqpTemplate.convertSendAndReceive(rabbitMQConfiguration.getExchange(), rabbitMQConfiguration.getRoutingkey(), billDTO);
    }

}
