package com.hp.a03collectiondemo;
import java.util.*;

/**
 * 斗地主 模拟 洗牌.
 * 牌数 : 54 张,  大王, 小王,   2-10 ,  A,J,Q , K  , 四个
 * ♥ , ♠ , ♣ , ♦
 * 1-10
 * ❤7      ♦7
 */
public class DouDiZhuTest {
    public static void main(String[] args) {
        // 1. 先造出 4个 花色
        List<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");
        // 2. 造出 10 个 2-10
        List<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        // 3. 上面的   colors 和 number 进行一个 整合 .
        //  放入到一个 新的集合中  如何做到呢? 嵌套循环
        List<String> piker = new ArrayList<>();
        // Set<String> piker= new HashSet<>();
        for (String color : colors) {
            for (String number : numbers) {
                piker.add(color + number);
            }
        }
        piker.add("BigKing");
        piker.add("littleKing");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());
        // 如果 使用set 也无法分开排序, 改为list,有个方法可以 打乱他的排序, 只能打断 list,
        // 因 set 无序的.
        Collections.shuffle(piker); // 打断list 的排序  斗地主的学名 洗牌
        System.out.println("piker = " + piker);
        // 给 player1 player2 player3 发牌.
        List<String> player1 = new ArrayList<>(); //  玩家1
        List<String> player2 = new ArrayList<>(); //  玩家2
        List<String> player3 = new ArrayList<>(); //  玩家3
        List<String> diPai = new ArrayList<>(); // 3张底牌
        for (int i = 0; i < piker.size(); i++) {
            String pName = piker.get(i); // 每张扑克牌.
            if (i >= 51) {
                diPai.add(pName); // 埋最后3张的底牌.
            } else {
                // 给玩家1,2,3 发 前面 51张牌
                if (i % 3 == 0) {
                    player1.add(pName);
                } else if (i % 3 == 1) {
                    player2.add(pName);
                } else {
                    player3.add(pName);
                }
            }
        }
        System.out.println("diPai = " + diPai);
        System.out.println("player1 = " + player1);
        System.out.println("player1 = " + player1.size());
        System.out.println("player2 = " + player2);
        System.out.println("player2 = " + player2.size());
        System.out.println("player3 = " + player3);
        System.out.println("player3 = " + player3.size());


        Collections.sort(piker);  // list 的快速排序(不是人工指定的排序, 下节课讲 人工指定排序)
        System.out.println("piker = " + piker);

        // 作业3:   1. 规定个地主,  规定 谁摸到红桃3 谁是地主,  注意:  底牌里面不能包含红桃3 .
    }
}

