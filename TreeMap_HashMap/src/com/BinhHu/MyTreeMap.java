package com.BinhHu;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<String, String> myTreeMap = new TreeMap<>();
        myTreeMap.put("a","Binh");
        myTreeMap.put("3a","Hu");
        myTreeMap.put("2hhhh","Gioi");
        System.out.println(myTreeMap);
        System.out.println("----------");
        Map<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(null,"Binh");
        myHashMap.put(3,"Hu");
        myHashMap.put(2,"Gioi");
        System.out.println(myHashMap);
    }
}
