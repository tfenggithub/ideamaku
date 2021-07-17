package com.hp.a03collectiondemo;

public class Person implements Comparable<Person>{
    private String name;
    private int heigth;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", heigth=" + heigth +
                ", age=" + age +
                '}';
    }
    //实现的接口是，比较接口，一个一个的比较。
    @Override
    public int compareTo(Person o) {
        //目前，按身高排序。
        //如果 return的返回值 大于0就是自身大于被比较对象
        //int x = this.getHeight() - o.getHeight();
        int a=this.getAge()-o.getAge();
        return a;
    }

}
