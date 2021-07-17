package com.hp.test01;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 *
 */

public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();//定义一个日期
        System.out.println("现在时间： " + date);
        long time = System.currentTimeMillis();
        time += 3*24*60*60*1000;
        Date date1 = new Date(time);
        System.out.println("三天后此时时间： " + date1);
    }
}
