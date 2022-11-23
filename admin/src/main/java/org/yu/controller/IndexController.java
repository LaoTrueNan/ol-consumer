package org.yu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yu.book.service.HelloService;

/**
 * @author guo
 * @date 2022/11/23 14:43
 */

@RestController
@RequestMapping("/ol")
public class IndexController {

    private final HelloService helloService;

    @Autowired
    public IndexController(HelloService helloService) {
        this.helloService = helloService;
    }


    @GetMapping("/aaa")
    public String aaaHandler(){
        return helloService.handler();
    }

    @GetMapping("/bbb")
    public String bbbHandler(){
        return "bbb";
    }
}
