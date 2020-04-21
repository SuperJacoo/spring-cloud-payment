package com.ghd.payment;

import com.ghd.payment.fallback.PaymentServiceFallBack;
import com.ghd.payment.module.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gehuadong@163.com
 * @date 2020-03-11 09:17
 */
@FeignClient(name = "PAYMENT-PROVIDER-SERVICE", fallback = PaymentServiceFallBack.class)
public interface PaymentService {

    /**
     * 使用OpenFeign调用接口
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/get-by-id")
    Response getPaymentById(@RequestParam("id") Long id);
}
