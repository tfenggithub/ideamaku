package com.hp.a05threaddemo01;
/*
* 线程创建的 最好用的 匿名内部类
* 创建线程的第三种方式
* */
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("洗了菜" + i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("烧水"+i);
                }
            }
        }.start();
    }
}
