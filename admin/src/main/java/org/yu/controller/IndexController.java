package org.yu.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yu.user.service.IUserService;

/**
 * @author guo
 * @date 2022/11/23 14:43
 */

@RestController
@RequestMapping("/ol")
public class IndexController {

    @DubboReference(version="1.0",check = false )
    private IUserService service;

    //    private final HelloService helloService;

//    @Autowired
//    public IndexController(HelloService helloService) {
//        this.helloService = helloService;
//    }


    @GetMapping("/aaa")
    public String aaaHandler(){
//        return helloService.handler(a);
//        return service.getOne(a);
        return String.valueOf(service.disLockTest());
    }

    @GetMapping("/bbb")
    public String bbbHandler(){
        return "bbb";
    }
}
