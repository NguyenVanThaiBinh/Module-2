package com.BinhHu.MyLinkedList;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<String> sStack = new MyStack<>();
        sStack.push("A");
        sStack.push("B");
        sStack.push("C");

        sStack.display();
        System.out.println("-----------------");
        sStack.pop();
        sStack.display();

    }
}
