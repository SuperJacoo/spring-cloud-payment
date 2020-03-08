package com.shuidihuzhu.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuidihuzhu.payment.mapper.PaymentMapper;
import com.shuidihuzhu.payment.module.Payment;
import com.shuidihuzhu.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author gehuadong@shuidihuzhu.com
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
