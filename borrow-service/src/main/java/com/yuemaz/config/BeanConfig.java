package com.yuemaz.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yuemaz
 * @Date 2022/4/18 20:05
 */
@Configuration
//@LoadBalancerClient(value = "userservice",  //指定为userservice服务
//                    configuration = LoadBalancerConfig.class)    //自己定义的配置类
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
