package com.hp.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 *
 * 思路：
 *  * 1. 用户输入生产日期和保质期（天数），就可以求出 过期日期
 *  * 2. 通过过期日期减去14天即为促销日期所在的周
 *  * 3. 通过所在周求出周三的日期
 *  * 算法：
 *  * 1.通过用户输入的两个日期，转换生产日期字符串为DATE类型，然后通过calendar进行加30天的计算，求出过期的日期
 *  * 2.通过calendar的过期日期，减去14天，计算出促销日期所在周
 *  * 3.设置calendar的为周三，即为促销日
 *  * 4.转换为DATE在转换为STR输出。
 *
 */

public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入生产日期(yyyy-MM-dd)");
        //用户输入生产日期
        String produceDate_usr = s.next();
        //用户输入保质期(天数）
        System.out.println("请输入保质期(天数)");
        int badDays_usr = s.nextInt();
        //根据用户输入的两个日期，求出过期日期为
        //首先，需要SDF定义时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //Str --- Data  用 sdf.prase(produceDate_usr)
        Date produceDate = sdf.parse(produceDate_usr);

        //然后转换date为了进行calendar计算加30天的记过
        //Date ----  Calendar 用 calendar.setTime()
        //前提：先建立Calendar实例
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(produceDate);

        //转换完成进行计算，先加30天保质期,用 calendar.add(Calendar.Day_Of_Year,30)
        calendar.add(Calendar.DAY_OF_YEAR,    badDays_usr );
        //加完30天减去14天
        calendar.add(Calendar.DAY_OF_YEAR, -14);
        //已经到促销的这周，设置周三的日期
//        System.out.println(calendar.getTime());
        calendar.set(Calendar.DAY_OF_WEEK, 4);
        //计算完毕，Calendar ---- Data  用calendar.getTime()
//        System.out.println(calendar.getTime());
        Date goodDate = calendar.getTime();

        //然后Date转换成字符串形式输出  Date ---- Str用  sdf.format(goodDate);
        String result = sdf.format(goodDate);

        //输出结果
        System.out.println("促销日期："+result);
    }
}
