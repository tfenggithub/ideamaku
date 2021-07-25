package com.hp.a03collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

/*
* 集合
* */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        //ArrayList c1 = new ArrayList();
        //add添加
        c1.add("唐僧");
        c1.add("孙悟空");
        c1.add("猪八戒");
        c1.add("沙悟净");
        c1.add("小白龙");
        System.out.println("c1 = " + c1);
        //尺寸
        int size = c1.size();
        System.out.println("size = " + size);
        boolean empty = c1.isEmpty();
        System.out.println("empty = " + empty);
        //集合的清空
        //c1.clear();
        System.out.println("c1 " + c1);
        boolean empty1 = c1.isEmpty();
        System.out.println("empty1 = " + empty1);
        //集合的遍历 3种
//        for (int i = 0; i < c1.size(); i++) {
//            System.out.println("c1.get(i) = " + c1.get(i));
//        }

        //
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
        //迭代器 和for 循环的区别
        //迭代器工作：有游标，问下一个，有没有下一个元素，如果有就拿出，没有就结束
        //for循环的工作;把集合从0--N 排序，从0开取，拿下标，解释了为什么学了佛如循环后在学一个迭代器

    }
}
