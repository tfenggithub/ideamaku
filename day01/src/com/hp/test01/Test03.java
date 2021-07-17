package com.hp.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。

 *
 */

public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的生日, 输入格式为:yyyy-MM-dd");
        String birthday = sc.nextLine();
        Date birDate = sdf.parse(birthday);
        Date now = new Date();
        long time = now .getTime() - birDate.getTime();
        long day = time/1000/60/60/24;
        System.out.println("到今天经历了:"+day+"天");
        long week = time/1000/60/60/24/7;
        System.out.println("到今天经历了:"+week+"周");

    }
}
