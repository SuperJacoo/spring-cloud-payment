package com.ghd.payment.fallback;

import com.ghd.payment.PaymentService;
import com.ghd.payment.utils.NewResponseUtil;
import com.ghd.payment.module.Response;

/**
 * @author gehuadong@163.com
 * @date 2020-03-11 15:49
 */
public class PaymentServiceFallBack implements PaymentService {

    @Override
    public Response getPaymentById(Long id) {
        return NewResponseUtil.makeFail("10001");
    }
}
