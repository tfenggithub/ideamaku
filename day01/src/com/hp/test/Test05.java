package com.hp.test;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String []str2=new String[5];//定义一个长度为5的数组，因为要生成的是一个5位的验证码
        String str3="";//声明一个字符串类型的变量
        int str=0;//声明一个int类型的变量，并给它初始化
        char str1=0;//声明一个char类型的变量，并给它初始化
        for (int i=0;i<str2.length;i++){
            Random R=new Random();//随机生成数
            str=R.nextInt(58)+65;//随机生成58个数，并从65开始 **阿斯克码a=65
            str1=(char)str;//将整形的str转化成char类型的
            if (str>=65&&str<=90||str>=97&&str<=122){
                str3=str1+str3;//将字符依次加入字符串中
            }else {
                i--;//如果生成的数是在90—97之间的，它会占用循环次数，生成的验证码可能不是5位的。所以当出现这些情况时必须
            }
        }

        System.out.println(str3);
        System.out.println("验证码是"+str3.toString());
        System.out.println("请输入验证码");
        String s=input.next();
        boolean boo=s.equalsIgnoreCase(str3);//比较两个字符串，不用区分大小写，只用字母对就行了
        if (boo==true){
            System.out.println("验证码正确");
        }else {
            System.out.println("验证码错误");
        }
    }

}
