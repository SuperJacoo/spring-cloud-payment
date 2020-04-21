package com.ghd.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gehuadong@ghd.com
 * @date 2020-03-08 11:30
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PaymentConsumerService01Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsumerService01Application.class, args);
    }
}
