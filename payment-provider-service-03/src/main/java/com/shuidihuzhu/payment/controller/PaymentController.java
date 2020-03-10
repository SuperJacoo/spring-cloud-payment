package com.shuidihuzhu.payment.controller;

import com.shuidihuzhu.payment.module.Response;
import com.shuidihuzhu.payment.utils.NewResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gehuadong@shuidihuzhu.com
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
