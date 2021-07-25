package com.hp.a04myio;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
* 文件的拷贝
* */
public class IODemoCopy01 {
    public static void main(String[] args) throws IOException {

            RandomAccessFile copytarget = new RandomAccessFile("", "r");
            RandomAccessFile secondname = new RandomAccessFile("", "rw");
            int d = -1;

            while (true) {

                if ((d = copytarget.read()) != -1) {
                    secondname.write(d);
                }
            }
    }
}
