package com.springcloud.windmill.serviceribbon.controller;

import com.springcloud.windmill.serviceribbon.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class HelloController {
    @Autowired
    private HelloService helloService;

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "/hai")
    public String hi(@RequestParam String name) {
        logger.info("start...");
        return helloService.hiService(name);
    }
}
