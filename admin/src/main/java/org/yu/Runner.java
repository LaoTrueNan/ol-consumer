package org.yu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.yu.book.service.HelloService;

/**
 * @author guo
 * @date 2022/11/23 14:38
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
//@EnableFeignClients(clients = HelloService.class)
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class,args);
    }
}
