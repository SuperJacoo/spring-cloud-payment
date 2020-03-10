package com.shuidihuzhu.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-07 22:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentProviderService03Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderService03Application.class, args);
    }
}
