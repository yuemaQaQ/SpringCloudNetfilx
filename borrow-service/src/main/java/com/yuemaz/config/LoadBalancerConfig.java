//package com.yuemaz.config;
//
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
//import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
//import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
//import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//
///**
// * @Author yuemaz
// * @Date 2022/4/18 21:58
// */
////轮循改为随机
//@Configuration
//public class LoadBalancerConfig {
//
//    @Bean
//    public ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(
//            Environment environment, LoadBalancerClientFactory loadBalancerClientFactory
//    ) {
//        String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//        return new RandomLoadBalancer(loadBalancerClientFactory.getLazyProvider(name, ServiceInstanceListSupplier.class), name);
//    }
//}
