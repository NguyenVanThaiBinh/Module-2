package com.BinhHu.Not.MyDSA;

public class Test_MyStackFromArray {
    public static void main(String[] args) {
        MyStackFromArray<String> MyStack = new MyStackFromArray();
        System.out.println(MyStack.isEmpty());

        MyStack.push("Binh");
        MyStack.push("Hu");
        MyStack.push("Mam");
        MyStack.push("Nem");


        MyStack.display();
        System.out.println(MyStack.getSize());
        System.out.println("---------");

        MyStack.pop();

        MyStack.display();
        System.out.println(MyStack.getSize());

        System.out.println("---------");
        System.out.println(MyStack.peek());
        System.out.println(MyStack.getSize());

        System.out.println(MyStack.isEmpty());
    }
}
