package org.yu.book.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guo
 * @date 2022/11/23 14:44
 */

@FeignClient(value = "hahaha")
public interface HelloService {


    @GetMapping("/user/hello")
    String handler();
}
