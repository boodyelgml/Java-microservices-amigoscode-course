package org.rabbitmq;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RabbitMQProducer {
    private final AmqpTemplate amqpTemplate;

    public void publish(Object message, String exchange, String routingKey) {
        amqpTemplate.convertAndSend(exchange, routingKey, message);
    }
}
