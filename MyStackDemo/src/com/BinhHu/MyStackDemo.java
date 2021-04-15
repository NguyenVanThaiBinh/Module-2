package com.BinhHu;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> stackBinh = new MyStack();
        stackBinh.push("BInh");
        stackBinh.push("HU");
        stackBinh.push("NGU");
        stackBinh.disPlay();

        System.out.println("----------------");
        stackBinh.pop();
        stackBinh.disPlay();
    }
}
