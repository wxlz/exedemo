package com.example.exedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wangxiang
 * @Date : 2019/11/20 17:48
 * @Description: TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }
}
