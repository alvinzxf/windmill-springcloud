package com.springcloud.windmill.servicefeign.controller;

import com.springcloud.windmill.servicefeign.client.SchedualServiceHai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhou.xiaofeng
 * @description
 * @date 2019-05-13
 */
@RestController
public class HaiController {

    @Autowired
    private SchedualServiceHai serviceHai;

    /**
     * controller暴露的API接口
     * @param name
     * @return
     */
    @GetMapping(value = "/hai")
    public String sayHi(@RequestParam String name) {
        return serviceHai.sayHaiFromClientOne( name );
    }

}
