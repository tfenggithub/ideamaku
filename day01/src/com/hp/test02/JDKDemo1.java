package com.hp.test02;

import java.util.ArrayList;
import java.util.List;

/*
* forEach 循环遍历
* */
public class JDKDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //no.1
        for(Integer number : numbers){
            System.out.println(number);
        }
        //no.2
        for(int index=0,len=numbers.size();index<len;index++){
            System.out.println(numbers.get(index));
        }
        //使用jdk1.8后，可这么写
        //no.1
        numbers.forEach((Integer integer) -> {
            System.out.println(integer);
        });
        //no.2
        numbers.forEach(integer -> {
            System.out.println(integer);
        });
        //no.3
        numbers.forEach(integer -> System.out.println(integer));
        //no.4
        numbers.forEach(System.out::println);

    }
}
