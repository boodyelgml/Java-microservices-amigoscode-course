package org.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.openfiegn")
@EnableDiscoveryClient
@Slf4j
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class);
    }

}