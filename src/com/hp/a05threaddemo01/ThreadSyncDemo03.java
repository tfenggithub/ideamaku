package com.hp.a05threaddemo01;
/**
 * synchronized 是可以锁在静态方法static方法上
 *
 */

public class ThreadSyncDemo03 {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                Shop1.buy();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Shop1.buy();
            }
        };
        t1.start();t2.start();
    }
}
class Shop1{
    public synchronized static void buy(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"xuan....");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+"shi....");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+"chu....");
    }
}