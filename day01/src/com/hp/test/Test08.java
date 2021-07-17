package com.hp.test;

import java.util.HashMap;
import java.util.Map;

// 练习:  { "username":"tangseng", "age":"500"  }  提取json 中的  k 和  v .. 赋值到一个对象
// QuJingRen 类-----> username ,  age
public class Test08 {
    public static void main(String[] args){
        Map params = new HashMap();
        Map dict = new HashMap();
        //判断字典内是否为空
        System.out.println("isEmpty="+params.isEmpty());
        //判断字典的大小(与判断数组的长度类似)
        System.out.println("size="+params.size());
        //给字典放入对应的key键value值(给字典增加key-value)
        params.put("key","values");
        params.put("key2","values2");
        System.out.println("params="+params);
        //获取字典中的对应key的value(获取对应键的值如果没有就返回null)
        System.out.println("getValue="+params.get("key3"));
        //返回字典中key的集合方法(集合暂时可以简单理解为数组)
        System.out.println("keySet="+params.keySet());
        //返回字典中value的集合方法(集合暂时可以简单理解为数组)
        System.out.println("values="+params.values());
        //返回字典的集合方法(集合暂时可以简单理解为数组)
        System.out.println("entrySet="+params.entrySet());
        //判断字典中是否有对应的key值(如果有就为true否则false)
        System.out.println("containsKey="+params.containsKey("key"));
        //判断字典中是否有对应的value值(如果有就为true否则false)
        System.out.println("containsValue="+params.containsValue("values2"));
        //判断字典中是否有对应的key值，如果有返回value，如果没有就返回defaultValue里面的值
        System.out.println("getOrDefault="+params.getOrDefault("key3","none"));

        //字典有个注意的地方是key必须是唯一的,但是value可以相同
        //字典种如果key值相同会导致后面key的数据覆盖前面的key的数据
        dict.put("key1","values");
        dict.put("key1","values1");
        dict.put("key3","values1");
        System.out.println("dict="+dict);
        //清空字典中所有的key和value
        dict.clear();
        System.out.println("dict-clear="+dict);
        //put方法只能增加单个对应的key-value
        //这里putAll是可以直接把完整的字典对象直接赋值进去
        dict.putAll(params);
        //判断两个字典是否相等
        System.out.println("equals="+params.equals(dict));
        //替换字典种对应key的value值
        params.replace("key","replace");
        System.out.println("replace="+params);

    }
}
