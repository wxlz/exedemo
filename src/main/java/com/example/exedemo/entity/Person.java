package com.example.exedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : 王祥
 * @Date : 2019/11/19 19:39
 * @Description: TODO
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int id;
    private String name;
    private String address;


}
