package com.hp.test;

/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //1.将"大家好!"修改为:"大家好!我是程序员!"并输出。
        StringBuilder s=new StringBuilder("大家好!");
        //追加
        s.append("我是程序员!");
        System.out.println(s);
        //2. 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
        s.insert(6,"优秀的");//插入
        System.out.println(s);
        //3.然后再修改为:"大家好!我是牛牛的程序员!"并输出
        s.replace(6,9,"牛牛的");
        System.out.println(s);
        //4.然后在修改为:"我是牛牛的程序员!"并输出
        s.delete(0,4);
        System.out.println(s);

    }
}

