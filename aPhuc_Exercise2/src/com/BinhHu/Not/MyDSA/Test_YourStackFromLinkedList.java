package com.BinhHu.Not.MyDSA;

public class Test_YourStackFromLinkedList {
    public static void main(String[] args) {
        YourStackFromLinkedList<String> YourStack = new YourStackFromLinkedList();
        YourStack.push("Binh");
        YourStack.push("Hu");
        YourStack.push("Mam");
        YourStack.push("Nem");
        YourStack.display();
        System.out.println("--------");
        YourStack.pop();
        YourStack.display();
    }
}
