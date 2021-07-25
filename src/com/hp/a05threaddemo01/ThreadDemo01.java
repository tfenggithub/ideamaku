package com.hp.a05threaddemo01;
/*
* 线程....
* 以前代码都是 自上到下的执行
*
* 创建线程的 第一种方式 缺点：直接extends thread 浪费一次继承的机会
* */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new Thread();//烧水的线程
        Thread t2 = new Thread();//洗菜的线程
        t1.start();
        t2.start();
    }
}
//如果只单单new thread ，只是一个线程，线程中没有方法（任务），没意义
//需要自己 创建一个 线程 ，继承任务方法
//线程中最有意义的就是 run 方法
class HotWaterThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧了" + i+"瓶水");
        }
    }
}
class XiCaiThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("洗了 " + i+"菜");
        }
    }
}