package com.huni.service;


import com.alibaba.dubbo.config.annotation.Service;

/**
 * @功能描述:
 * @项目版本:
 * @项目名称:
 * @相对路径: com.huni.service
 * @创建作者: 周虎
 * @创建日期: 2018/11/26 09:52
 */
@Service
public class SayHelloImpl implements ISayHello {
    @Override
    public String sayHello() {
        return "i love you ";
    }
}
