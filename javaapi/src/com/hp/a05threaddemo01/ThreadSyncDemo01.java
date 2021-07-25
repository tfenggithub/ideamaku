package com.hp.a05threaddemo01;
/**
 * 多个线程同时操作一个资源诞生的 安全问题
 * synchronized. 锁的机制 可以解决多线程的安全问题。
 * 解决的手段是将原本的多个线程、咯干各的"变为按顺序执行。
 * 未加synchronized锁之前，线程是异步的。给方法加上synchronized 锁就变成同步
 * 将有序的同步执行，就会解决安全问题， 但是缺点是因为有序,需要等待方法内的程序走完，
 * 才进行下一-个线程，所以，效率上会慢点。
 *
 * synchronized 锁锁在不同位置,起到不同的效果。
 */
public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                //模拟 1 取票
                while(true){
                    int ticket = tickets.getTicket();
                    Thread.yield();
                    System.out.println(getName()+"线程拿去了"+ticket);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                //模拟 2 取票
                while(true){
                    int ticket = tickets.getTicket();
                    Thread.yield();
                    System.out.println(getName()+"线程拿去了"+ticket);
                }
            }
        };

        t1.start(); t2.start();
    }
}
class Tickets{
    private int ticket=20;

    public synchronized int getTicket() {
        if (ticket==0){
            System.out.println("票没有了");
            throw  new RuntimeException("票没了");
        }
        Thread.yield();//线程的让一让
        return ticket;
    }
}