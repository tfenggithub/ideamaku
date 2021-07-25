package test;

import java.util.Calendar;

/*
* 日历类：
* 使用场景
* */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //创建对象 不仅仅只有new ，还有 类的实例方法
        //calendar 比date方便 calendar功能上包含了 date的大部分功能 是date的升级版
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        //日历可以进行计算  比如 增加add
        //增加一个年份 增加10年
//        calendar.add(Calendar.YEAR,10);
//        System.out.println("calendar.getTime() = " + calendar.getTime());
        //加月份
//        calendar.add(Calendar.MONTH,1);
        //加天
//        calendar.add(Calendar.DAY_OF_MONTH,1);
        //减去1天
//        calendar.add(Calendar.DAY_OF_MONTH,-1);
        //设置当周的日期
//        calendar.set(Calendar.DAY_OF_MONTH,Calendar.FRIDAY);

        System.out.println("calendar.getTime() = " + calendar.getTime());
        //计算每个月份的最大值 求月底的时间
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("days = " + days); //31天
        //日历 get 方法 日历的 其他获取方法
        // 查询今年过了多少多天
        int i = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("i = " + i);
        //查询今天是周几
        int i1 = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天周 " + i1);
        String[] weeks ={"周日","周一","周二","周三","周四","周五","周六"};
        int i2 = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天是 " + weeks[i2]);
        int i3 = calendar.get(Calendar.MONTH) + 1;
        System.out.println("i3 = " + i3);
        //设置年份
        calendar.set(Calendar.YEAR,2008);
        System.out.println("calendar = " + calendar);
        //设置月份
        calendar.set(Calendar.MONTH,Calendar.APRIL); //月份从0开始
        System.out.println("calendar = " + calendar.getTime());
        //设置，week

    }
}
