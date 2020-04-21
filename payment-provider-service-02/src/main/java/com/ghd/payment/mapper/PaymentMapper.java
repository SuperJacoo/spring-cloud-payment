package com.ghd.payment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghd.payment.module.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 22:46
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
