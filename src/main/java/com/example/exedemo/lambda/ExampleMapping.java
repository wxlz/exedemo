package com.example.exedemo.lambda;

import com.example.exedemo.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 *Java8 Collectors.groupingBy and Collectors.mapping example
 */
public class ExampleMapping {

    private static List<Person> personList = new ArrayList<>();

    static {
        personList.add(Person.builder().id(10).address("shanghai").build());
        personList.add(Person.builder().id(12).address("apple").address("wuhan").build());
        personList.add(Person.builder().id(16).address("apple").address("nanjing").build());
    }

    public static void main(String[] args) {
        //分组
        Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(c -> c.getAddress()));
        System.out.println(collect);
    }
}
