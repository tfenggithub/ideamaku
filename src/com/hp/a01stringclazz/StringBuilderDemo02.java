package com.hp.a01stringclazz;
/**/
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        String str = "a";
        StringBuilder sb = new StringBuilder(str);
        long l = System.currentTimeMillis();
        for (int i = 0; i < 30; i++) {
            sb.append(str);
            System.out.println("sb = " + sb);
        }
        System.out.println(System.currentTimeMillis()-l);// 当前日期的 long值

    }
}
