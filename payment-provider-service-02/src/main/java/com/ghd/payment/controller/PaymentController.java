package com.ghd.payment.controller;

import com.ghd.payment.service.PaymentService;
import com.ghd.payment.utils.NewResponseUtil;
import com.ghd.payment.module.Payment;
import com.ghd.payment.module.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 23:05
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * 根据ID查询付款信息
     *
     * @param id
     * @return
     */
    @GetMapping("/get-by-id")
    public Response getPaymentById(Long id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Payment payment = paymentService.getPaymentById(id);
        return NewResponseUtil.makeSuccess(payment);
    }
}
