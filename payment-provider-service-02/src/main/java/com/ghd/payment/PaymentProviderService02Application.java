package com.ghd.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 22:40
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentProviderService02Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderService02Application.class, args);
    }
}
