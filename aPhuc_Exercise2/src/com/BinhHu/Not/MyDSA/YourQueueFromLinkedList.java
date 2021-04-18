package com.BinhHu.Not.MyDSA;

import java.util.LinkedList;

public class YourQueueFromLinkedList<E> {
    LinkedList YourQueue = new LinkedList();

    public void enQueue(E element) {
        YourQueue.addLast(element);

    }

    public E deQueue() {
        return (E) YourQueue.removeFirst();
    }
    public int getSize(){
        return YourQueue.size();
    }
    public void display(){
        for (int i = 0; i < YourQueue.size(); i++) {
            System.out.println(YourQueue.get(i));
        }
    }

}
