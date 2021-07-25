package com.hp.a05threaddemo01;
/**
 *
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        Thread cy = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while(true) {
                    try {
                        System.out.println(" 吃大肘子" + i);
                        i++;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            if (e.getMessage().equals("sleep interrupted")) {
                                System.out.println("yy阻止cy吃大肘子");
                                break;
                            }
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        cy.start();
        Thread yy =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    cy.interrupt();//打断cy
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        yy.start();
    }
}
