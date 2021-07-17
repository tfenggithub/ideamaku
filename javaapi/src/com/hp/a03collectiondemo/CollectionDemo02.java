package com.hp.a03collectiondemo;
/*
* 集合存的对象的引用，当对象通过外力改变了，那么 集合中的内容也会变
* */
import java.util.ArrayList;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Person fansisi = new Person();
        fansisi.setName("范思思");
        fansisi.setAge(16);
        fansisi.setHeigth(156);
        ArrayList c = new ArrayList();
        c.add(fansisi);
        for (Object o : c) {
            System.out.println("o = " + o);
        }
        fansisi.setHeigth(400);
        fansisi.setName("贾玲");
        fansisi.setAge(30);
        for (Object o : c) {
            System.out.println("o = " + o);
        }
    }
}
