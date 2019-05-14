package com.springcloud.windmill.servicefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhou.xiaofeng
 * @description 调用远程服务service-client
 * @date 2019-05-13
 */

@FeignClient(value = "service-client")
public interface SchedualServiceHai {
    /**
     * 调用远程服务service-client
     * 的hello方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHaiFromClientOne(@RequestParam(value = "name") String name);

}
