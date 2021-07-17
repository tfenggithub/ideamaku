package com.hp.a01stringclazz;
/*
* 测试 String 类的 性能 , 总结: 频繁修改字符串, 会造成性能损失,需要 stringBuffer/Build
*频繁修改字符串 , 会造成内村溢出的错误..
* String , StringBuild , StringBuffer
* */
public class StringDemo02 {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(System.currentTimeMillis());// 当前日期的 long值
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            str +=str;//测试频繁修改字符串
            System.out.println("str = " + str);
        }
        System.out.println(System.currentTimeMillis()-l);// 当前日期的 long值

    }
}
