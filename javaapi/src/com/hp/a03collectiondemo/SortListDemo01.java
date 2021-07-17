package com.hp.a03collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 排序集合 对集合进行自然排序（从小到大）
* */
public class SortListDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(40);
        list.add(60);
        list.add(30);
        list.add(80);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
        //纯字符串
        List<String> list1 = new ArrayList<>();
        list1.add("貂蝉");
        list1.add("小乔");
        list1.add("大乔");
        list1.add("蔡文姬");
        list1.add("吕布");
        System.out.println("list1 = " + list1);
        Collections.sort(list);
        System.out.println("list1 = " + list1);
        //对象的排序
        Person p1 = new Person();
        p1.setName("貂蝉");
        p1.setHeigth(160);
        p1.setAge(18);
        Person p2 = new Person();
        p2.setName("小乔");
        p2.setHeigth(150);
        p2.setAge(19);
        Person p3 = new Person();
        p3.setName("大乔");
        p3.setHeigth(180);
        p3.setAge(16);
        Person p4 = new Person();
        p4.setName("蔡文姬");
        p4.setHeigth(167);
        p4.setAge(16);
        Person p5 = new Person();
        p5.setName("吕布");
        p5.setHeigth(190);
        p5.setAge(20);
        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        Collections.sort(personList);
        System.out.println("personList = " + personList);
        Collections.sort(personList);
        System.out.println("personList = " + personList);
        Collections.reverse(personList);
        System.out.println("personList = " + personList);
    }
}
