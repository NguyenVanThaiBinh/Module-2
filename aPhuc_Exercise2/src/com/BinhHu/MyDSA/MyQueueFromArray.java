package com.BinhHu.MyDSA;

import java.util.*;

public class MyQueueFromArray<E> {

    int Capacity = 3;
    int currentIndex = 0;
    E[] MyQueue = (E[]) new Object[Capacity];// ep kieu Object ve kieu E

    private void ensureCapa() {
        int newSize = MyQueue.length * 2;
        MyQueue = Arrays.copyOf(MyQueue, newSize);
    }

    public void enQueue(E element) {
        if (currentIndex >= Capacity) {
            ensureCapa();
        }
        MyQueue[currentIndex] = element;
        currentIndex++;
    }

    public E deQueue() {
        if (currentIndex == 0) {
            throw new RuntimeException("Not thing to deQueue!");

        }
        if (currentIndex == 1) {
            E temp = MyQueue[0];
            MyQueue = Arrays.copyOf(MyQueue, currentIndex - 1);
            currentIndex--;
            return temp;
        }
        E temp = MyQueue[0];
        for (int i = 1; i < currentIndex; i++) {
            MyQueue[i - 1] = MyQueue[i];
        }
        MyQueue = Arrays.copyOf(MyQueue, currentIndex - 1);

        currentIndex--;
        return temp;
    }

    public void display() {
        if (currentIndex == 0) {
            System.out.println("Not thing to display!");
            return ;
        }
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(MyQueue[i]);
        }
    }
}
