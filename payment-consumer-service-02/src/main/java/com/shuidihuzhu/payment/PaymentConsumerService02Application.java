package com.shuidihuzhu.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-08 11:30
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentConsumerService02Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsumerService02Application.class, args);
    }
}
