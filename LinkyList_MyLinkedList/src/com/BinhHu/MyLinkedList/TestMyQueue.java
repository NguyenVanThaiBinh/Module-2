package com.BinhHu.MyLinkedList;

public class TestMyQueue {
    public static void main(String[] args) {
       MyQueue<String> sQueue = new MyQueue<>();
       sQueue.enQueue("A");
       sQueue.enQueue("B");
       sQueue.enQueue("C");
       sQueue.display();
       sQueue.deQueue();
        System.out.println("--------___-----------");
        sQueue.display();
    }
}
