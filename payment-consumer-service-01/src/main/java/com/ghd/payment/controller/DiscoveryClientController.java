package com.ghd.payment.controller;

import com.ghd.payment.module.Response;
import com.ghd.payment.utils.NewResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gehuadong@163.com
 * @date 2020-03-08 21:17
 */
@Slf4j
@RestController
@RequestMapping("/discovery-client")
public class DiscoveryClientController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 利用DiscoveryClient获取实例列表
     *
     * @return
     */
    @GetMapping("/get-instance-list")
    public Response getInstanceList() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("service list: ", service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENT-PROVIDER-SERVICE");
        return NewResponseUtil.makeSuccess(instances);
    }
}
