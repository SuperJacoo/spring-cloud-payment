package com.ghd.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gehuadong@ghd.com
 * @date 2020-03-07 22:40
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentProviderService01Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderService01Application.class, args);
    }
}
