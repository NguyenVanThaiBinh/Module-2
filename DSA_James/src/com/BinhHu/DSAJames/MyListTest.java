package com.BinhHu.DSAJames;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);




        for (int i = 0; i < listInteger.length(); i++) {
            System.out.println(listInteger.get(i));
        }
        System.out.println("------------");
        System.out.println(listInteger.length());

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
//
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }

}
