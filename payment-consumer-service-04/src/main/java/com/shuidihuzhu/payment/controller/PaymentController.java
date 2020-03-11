package com.shuidihuzhu.payment.controller;

import com.shuidihuzhu.payment.module.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-07 23:05
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "http://payment-provider-service";

    @GetMapping("/get-by-consul")
    public Response getByConsul() {
        Response response = restTemplate.getForObject(url + "/payment/get-by-consul", Response.class);
        return response;
    }
}