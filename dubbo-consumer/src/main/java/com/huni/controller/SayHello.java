package com.huni.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huni.service.ISayHello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @功能描述:
 * @项目版本:
 * @项目名称:
 * @相对路径: com.huni.controller
 * @创建作者: 周虎
 * @创建日期: 2018/11/26 10:03
 */
@RestController
@RequestMapping("/")
public class SayHello {
    @Reference
    private ISayHello sayHello;
    @RequestMapping("hello")
    public  String hello(){
        System.out.println(sayHello.sayHello());
        return  sayHello.sayHello();
    }
}
