package com.hp.a05threaddemo01;
/*
* 线程中的阻塞
* */
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3000; i++) {
            Thread.sleep(2);//线程的阻塞
            System.out.println("访问 " + i+"次");
        }
     //其实main 方法 就是一个线程 是一个主线程
        Thread thread = Thread.currentThread();//拿到当前线程
        String name = thread.getName();
        System.out.println("name = " + name);
        long id = thread.getId();
        System.out.println("id = " + id);
        boolean daemon = thread.isDaemon();//
        System.out.println("daemon = " + daemon);
        int priority = thread.getPriority();
        System.out.println("priority = " + priority);//线程优先级
        boolean alive = thread.isAlive();//线程死了没
        System.out.println("alive = " + alive);
    }
}
