package com.ghd.payment.service;


import com.ghd.payment.module.Payment;

/**
 * @author gehuadong@163.com
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
