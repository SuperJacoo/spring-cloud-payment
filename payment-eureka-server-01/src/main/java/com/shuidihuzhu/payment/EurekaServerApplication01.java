package com.shuidihuzhu.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-08 11:05
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication01 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication01.class, args);
    }
}
