package com.hp.a01stringclazz;
/*
* stringbuilder/buffer 解决 字符串频繁修改的问题
* 意思是把string升级了
* string 类 重点 重用性
* StringBuilder /Buffer 倾向于 对字符串的修改
* 当用到字符大量的 追加/修改/删除的时候，就使用StringBuilder，StringBuffer
* StringBuilder的优点：内部有个可变的字符数组，速度快，内存消耗小
* */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        String str = "好好的学习Java";
        StringBuilder sb = new StringBuilder(str);
        //1.追加
        sb.append("，为了找一份好工作");
        System.out.println("sb = " + sb);
        //2.修改 为了找一份好工作 改为 为了改变世界
        sb.replace(10,18,"为了改变世界");
        System.out.println("sb = " + sb);
        //3.删除
        sb.deleteCharAt(2);//删除指定字符串
        System.out.println("sb = " + sb);
        //3.1 删除 字符区间
        sb.delete(2,5);
        System.out.println("sb = " + sb);
        //3.2 删除 全部
        sb.delete(0,sb.length());
        System.out.println("sb = " + sb);
        //4.插入 增加
        sb.insert(0,"努力活着");
        System.out.println("sb = " + sb);
        //5.对字符串 反转
        sb.reverse();
        System.out.println(sb);
    }
}
