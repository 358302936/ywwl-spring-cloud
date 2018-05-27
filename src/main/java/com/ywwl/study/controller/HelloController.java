package com.ywwl.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yanuun
 * @Date 20:24 2018/5/17
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    private String helloWord(){
        return "hello!";
    }
}
