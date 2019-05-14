package com.springcloud.windmill.servicefeign.client.fallback;

import com.springcloud.windmill.servicefeign.client.SchedualServiceHai;
import org.springframework.stereotype.Component;

/**
 * @author zhou.xiaofeng
 * @description
 * @date 2019-05-13
 */
@Component
public class SchedualServiceHaiHystric implements SchedualServiceHai {
    @Override
    public String sayHaiFromClientOne(String name) {
        return "sorry, you are fail," + name;
    }
}
