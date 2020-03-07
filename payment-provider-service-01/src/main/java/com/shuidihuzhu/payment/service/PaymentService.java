package com.shuidihuzhu.payment.service;

import module.Payment;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-07 22:47
 */
public interface PaymentService {

    /**
     * 根据ID查询付款信息
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
