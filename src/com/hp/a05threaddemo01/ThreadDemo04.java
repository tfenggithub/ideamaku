package com.hp.a05threaddemo01;

import java.util.Random;

/**
 * 线程的打断
 * 打断 针对线程的sleep来讲的
 *
 */

public class ThreadDemo04 {
    public static int time =4;//炸弹的倒计时
    public static int password = new Random().nextInt(1000);
    public static boolean boom=true;
    public static void main(String[] args) {
        System.out.println("炸弹的密码是: " + password);
        //第一个线程：炸弹的倒计时，如果完成倒计时 就爆炸
        Thread boomThread = new Thread(new Runnable() {
            @Override
            public void run() {
            //炸弹的倒计时
                System.out.println("定时炸弹已安放");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (time>=0){
                    try {
                        if (time==0){
                            System.out.println("任务失败，匪徒胜利");
                            boom = false;
                            break;
                        }
                        time--;
                        System.out.println("倒计时： " + time);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        if (e.getMessage().equals("sleep interrupted")){
                            System.out.println("拆弹成功");
                            break;
                        }

                        e.printStackTrace();
                    }

                }
            }
        });

        //第二个线程：是打断线程的倒计时 如果打断了 就不爆了
        Thread policeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("营救者正在拆弹了！！");
                while(boom){
                    if (password==new Random().nextInt(100)){
                     boomThread.interrupt();//这个是线程的打断
                     break;
                    }
                }
            }
        });
        boomThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        policeThread.start();
    }
}
