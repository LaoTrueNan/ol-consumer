package org.yu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @author guo
 * @date 2022/11/23 14:38
 */

@SpringBootApplication
@EnableDubbo
@EnableKafka
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class,args);
    }
}
