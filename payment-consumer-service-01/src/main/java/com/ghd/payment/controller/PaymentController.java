package com.ghd.payment.controller;

import com.ghd.payment.module.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 23:05
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "http://PAYMENT-PROVIDER-SERVICE";

    /**
     * 根据ID查询付款信息
     *
     * @param id
     * @return
     */
    @GetMapping("/get-by-id")
    public Response getPaymentById(Long id) {
        Response response = restTemplate.getForObject(url + "/payment/get-by-id?id=" + id, Response.class);
        return response;
    }
}