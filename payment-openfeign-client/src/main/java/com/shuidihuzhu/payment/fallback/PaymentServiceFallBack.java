package com.shuidihuzhu.payment.fallback;

import com.shuidihuzhu.payment.PaymentService;
import com.shuidihuzhu.payment.module.Response;
import com.shuidihuzhu.payment.utils.NewResponseUtil;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-11 15:49
 */
public class PaymentServiceFallBack implements PaymentService {

    @Override
    public Response getPaymentById(Long id) {
        return NewResponseUtil.makeFail("10001");
    }
}
