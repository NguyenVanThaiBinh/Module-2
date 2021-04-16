package com.BinhHu;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack_LinkList<String> stack = new MyStack_LinkList();
        stack.push("Binh");
        stack.push("Hu");
        stack.push("Mam");
        stack.push("Nem");
        stack.display();
        System.out.println("---------");

        System.out.println(stack.peek());



    }
}

//test stack array
//    MyStack<String> stackBinh = new MyStack();
//        stackBinh.push("BInh");
//        stackBinh.push("HU");
//        stackBinh.push("NGU");
//        stackBinh.disPlay();
//
//        System.out.println("----------------");
//        stackBinh.pop();
//        stackBinh.disPlay();
