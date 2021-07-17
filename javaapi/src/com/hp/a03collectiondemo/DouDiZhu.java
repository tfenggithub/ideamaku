package com.hp.a03collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
  完成斗地主案例 准备牌 洗牌 发牌操作
 */
public class DouDiZhu{
    public static void main(String[] args) {
        // 1. 准备牌
        // 1.1 创建存储牌面的集合
        List<String> pakerBox = new ArrayList<>();

        // 造牌
        // 1.2 创建花色集合 存储花色
        List<String> colors = new ArrayList<>();
        colors.add("❤");
        colors.add("♣");
        colors.add("♠");
        colors.add("♦");

        // 1.3 创建数字集合 存储数字
        List<String> numbers = new ArrayList<>();
        for(int i = 2; i<=10; i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        // 1.4 遍历 并拼接
        for (String color : colors){
            for (String number : numbers){
                String card = color + number;
                // 存牌 在盒中
                pakerBox.add(card);

            }
        }

        pakerBox.add("小王");
        pakerBox.add("大王");

//        System.out.println(pakerBox);
        // 2. 洗牌
        Collections.shuffle(pakerBox);
        // 就可以将牌的顺序打乱
//        System.out.println(pakerBox);

        // 3. 发牌
        // 3.1 创建三个玩家以及底牌集合
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();

        // 3.2 发牌按照索引决定发牌的顺序
        for (int i = 0 ; i < pakerBox.size(); i++){
            String card = pakerBox.get(i);

            // 这张牌给谁，通过索引解决
            // 先预留出底牌
            if(i>=51){
                dipai.add(card);
            } else {
                if (i % 3 == 0){
                    player1.add(card);
                } else if (i % 3 == 1){
                    player2.add(card);
                } else{
                    player3.add(card);
                }
            }
        }
        // 4. 查看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}

