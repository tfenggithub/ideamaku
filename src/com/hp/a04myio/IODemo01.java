package com.hp.a04myio;

import java.io.File;
import java.io.IOException;

/*
* file  文件*/
public class IODemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("/io01.txt");

        //查看文件是否存在
        boolean exists = file.exists();//判断文件是否存在
        if (exists){
            System.out.println("文件已经存在，Boolean值 = " + exists);
        }else{
            System.out.println("文件不存在，Boolean值 = " + exists);
            boolean creante = file.createNewFile();     //创建文件
            System.out.println("文件创建成功" + creante);
        }
        boolean isFile = file.isFile();
        System.out.println("是否是文件 " + isFile);
        boolean isdirectory = file.isDirectory();
        System.out.println("是否是目录 " + isdirectory);
        boolean hidden = file.isHidden();
        System.out.println("是否是隐藏文件 " + hidden);

        System.out.println("file = " + file);
        String name = file.getName();
        System.out.println("name = " + name);
        long length = file.length();
        System.out.println("length = " + length);
        //文件的删除
        if (exists){
            System.out.println("文件删除");
            file.delete();
        }
    }
}
