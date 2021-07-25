package com.hp.a03collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* JDK 8的快速取集合中的属性*/
public class ArrayListDemo {
    public static void main(String[] args) {
        Person diaochan = new Person();
        diaochan.setAge(18);
        diaochan.setHeigth(167);
        diaochan.setName("貂蝉");

        Person xiaoqiao = new Person();
        xiaoqiao.setAge(18);
        xiaoqiao.setHeigth(169);
        xiaoqiao.setName("貂蝉");

        Person ake = new Person();
        ake.setAge(18);
        ake.setHeigth(156);
        ake.setName("阿柯");


//        List list = new ArrayList();
//        list.add(diaochan);
//        list.add(xiaoqiao);
//        list.add(ake);
//        System.out.println("list = " + list);

        // 需求: 给定一个list person对象的集合, 需要一个 String 集合,该集合中的值是提取与上面3000个 list中的name值   把 美女的名字都存进去.
        List<Person> list = new ArrayList();
        list.add(diaochan);
        list.add(xiaoqiao);
        list.add(ake);
        System.out.println("list = " + list);

        //List<String>  names = new ArrayList<>();
        // 1. 遍历 list 集合 , 拿出对象的names 付给 新的names 集合中
//        for (Person s : list) {
//            String name = s.getName();
//            // 2. 赋值给新的集合
//                    names.add(name);
//        }
        //System.out.println("names = " + names);
        // 以上是传统的,  新的呢? JDK8 Stream() , 作业1:  自我学习 JDK8的新特性, 如何新的遍历 只少2个demo
        List<String> nameLists = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameLists = " + nameLists);

    }
}
