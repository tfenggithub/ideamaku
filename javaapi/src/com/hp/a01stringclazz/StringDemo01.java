package com.hp.a01stringclazz;

public class StringDemo01 {
    public static void main(String[] args) {
        //针对你面试的
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);
        //true 因为s2重用了s1的对象
        s1 = s1+"!";
        System.out.println("s1 == s2");
        //false 因为1，跟班不相等 2，深层次的原因，对象被修改了
        String s3 = "a" + "bc";
        System.out.println(s2 ==s3);
        //==比较的是 是否同一个对象
        // true 字符串的连接 等于没连接
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s4 == s2);
        //false s2是常量适中的字符串 而new String 是类
        System.out.println(s4);
        System.out.println(s4 == s5);
        // false f4 /s5 是不同阶段的对象
        System.out.println(s4.equals(s5));//true
        System.out.println(s4.equals(s2));//true
        // == 比较的是 内存地址 equals 比较的是2者是否相同

    }
}
