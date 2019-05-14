package com.springcloud.windmill.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhou.xiaofeng
 * @description
 * @date 2019-05-13
 */

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * service-client :应用名称
     * hello : client中的方法名对应的URL
     *
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "haiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-client/hello?name=" + name, String.class);
    }

    /**
     * 错误返回
     *
     * @param name
     * @return
     */
    public String haiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
