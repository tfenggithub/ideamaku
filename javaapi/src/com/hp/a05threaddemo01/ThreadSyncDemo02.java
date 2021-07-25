package com.hp.a05threaddemo01;

public class ThreadSyncDemo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();t2.start();
    }
}
class Shop{
    public void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("xuanyifu " + thread.getName());
        Thread.sleep(5000);
        synchronized (this) { //使用 synchronized 块，锁在 关键位置
            System.out.println("shiyifu " + thread.getName());
            Thread.sleep(5000);
            System.out.println(" over");
        }
    }
}