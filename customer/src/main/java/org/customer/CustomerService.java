package org.customer;

import lombok.RequiredArgsConstructor;
import org.openfiegn.Notification;
import org.rabbitmq.RabbitMQProducer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RabbitMQProducer producer;

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("customer with id" + id + "not found"));
    }

    public Customer create(Customer customer) {
        Customer result = this.customerRepository.save(customer);
        producer.publish(Notification.builder().createdAt(LocalDateTime.now().toString()).createdBy("admin").entity("customer").build(), "internal.exchange", "internal.notification.routing-key");
        return result;
    }
}
