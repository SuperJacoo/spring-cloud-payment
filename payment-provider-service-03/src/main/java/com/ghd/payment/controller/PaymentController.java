package com.ghd.payment.controller;

import com.ghd.payment.utils.NewResponseUtil;
import com.ghd.payment.module.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 23:05
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/get-by-zk")
    public Response getByZk() {
        log.info("invoke get by zk");
        return NewResponseUtil.makeSuccess("zookeeper");
    }
}
