package com.bhh.imooc.edusystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bhh
 * @description 测试Controller
 * @date Created in 2020-12-16 13:56
 * @modified By
 */
@RestController
public class TestController {

    @RequestMapping("/name")
    public String getName(){
        return "你的名字";
    }
}
