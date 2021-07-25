package com.hp.a05threaddemo01;
/**
 *互斥锁
 */

public class ThreadSyncDemo04 {
    public static void main(String[] args) {
        Shop2 shop2 = new Shop2();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    shop2.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    shop2.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();t2.start();
    }
}
class Shop2{
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
    //买冰淇淋
    public synchronized void buy2() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("maibingqilin" + thread.getName());
    }
}