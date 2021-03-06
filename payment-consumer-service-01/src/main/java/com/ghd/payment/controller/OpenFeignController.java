package com.ghd.payment.controller;

import com.ghd.payment.PaymentService;
import com.ghd.payment.module.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gehuadong@163.com
 * @date 2020-03-11 15:53
 */
@Slf4j
@RestController
@RequestMapping("/payment/consumer")
public class OpenFeignController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/get-by-openfeign")
    public Response getPaymentById(@RequestParam Long id) {
        return paymentService.getPaymentById(id);
    }
}
