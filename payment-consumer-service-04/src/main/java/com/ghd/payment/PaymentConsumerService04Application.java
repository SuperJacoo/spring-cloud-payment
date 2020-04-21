package com.ghd.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gehuadong@163.com
 * @date 2020-03-08 11:30
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentConsumerService04Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsumerService04Application.class, args);
    }
}
