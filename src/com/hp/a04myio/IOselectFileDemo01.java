package com.hp.a04myio;

import java.io.File;
/*
* io 能创建文件 也能创建文件夹
* */
public class IOselectFileDemo01 {
    private static long size =0;
    public static void main(String[] args) {
        //查询当前目录的 所有文件
        File file = new File(".");
       // File[] files = file.listFiles();
        //全部 查看所有文件
        long size =findAll(file);
        System.out.println("size = " + size +"字节");

        //作业2.遍历D盘其中一个文件 并查找出文件中带有Java的文件
        //作业3.遍历D盘其中一个文件 并查找出文件后缀名带有.class的文件
    }

    private static long findAll(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                findAll(file1);
            }else{
                System.out.println("file1 = " + file1.length());
                size = file1.length();
            }
        }
        return size;
    }
}
