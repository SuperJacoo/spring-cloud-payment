package com.ghd.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghd.payment.mapper.PaymentMapper;
import com.ghd.payment.module.Payment;
import com.ghd.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 22:48
 */
@Slf4j
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

    /**
     * 根据ID查询付款信息
     *
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id) {
        Assert.notNull(id, "id cannot be null");
        return this.getById(id);
    }
}
