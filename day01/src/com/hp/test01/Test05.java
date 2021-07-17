package com.hp.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18

 *
 */

public class Test05 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的生日, 输入格式为:yyyy-MM-dd");
        String birthday = sc.nextLine();
        Date birDate = sdf.parse(birthday);
        String time = sdf.format(birDate);
        System.out.println("出生日期 " + time); //获取出生日期
        //获取20 岁生日 ---加20年份
        long time1 = birDate.getTime();

//        Calendar calendar = Calendar.getInstance();
//        System.out.println("calendar = " + calendar);
//        calendar.add(Calendar.YEAR,20);
//        System.out.println("calendar = " + calendar.getTime());
    }
}
