package com.shuidihuzhu.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-08 11:30
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentConsumerService01Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsumerService01Application.class, args);
    }
}
