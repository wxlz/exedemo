package com.example.exedemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author : wangxiang
 * @Date : 2019/11/21 11:01
 * @Description: TODO
 */

@Configuration
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //弃用安全策略
        http.httpBasic().disable();
    }
}
