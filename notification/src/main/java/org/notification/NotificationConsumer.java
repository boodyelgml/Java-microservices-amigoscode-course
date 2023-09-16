package org.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class NotificationConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void justPrint(Object message) {
        System.out.println(message);
    }
}
