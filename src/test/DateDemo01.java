package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*企业开发中(java,bigData) 日期
* 日期类的层是 有一个long值 学名UTC时间
* 1970年1月1日00：00：00 开始 计算时间元年
* 日期类 有2个包 sql/util 我们用util包下的日期
* */


public class DateDemo01 {
    public static void main(String[] args) {
        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date);
        //tostring()被改写了  可以重新 改为自己的时间
        long time = date.getTime();
        System.out.println("time = " + time);

        // 练习：查看25天后是那一天？
        time += 1000 * 60 * 60 * 24 * 10L;
        date.setTime(time);
        System.out.println("date = " + date);
        //修改 日期显示格式 yyyy必须小写
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String chinaDateStr = sdf.format(date);
        System.out.println("chinaDateStr = " + chinaDateStr);
        //字符串 ----->  转日期
        String dateStr = "2018-09-97 23:13:45";
            try {
                Date parse = sdf.parse(dateStr);
                System.out.println("parse = " + parse);
            } catch (ParseException e) {
                System.out.println("你的日期字符串可能不是一个日期。你用心填写一下");
                e.printStackTrace();
            }

    }
}

