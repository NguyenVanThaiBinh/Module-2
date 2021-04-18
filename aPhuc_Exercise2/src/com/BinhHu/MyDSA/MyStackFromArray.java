package com.BinhHu.MyDSA;

import java.util.Arrays;

public class MyStackFromArray<E> {
    int CAPACITY = 3;
    int currentIndex = 0;
    E[] MyStack = (E[]) new Object[CAPACITY];

    public boolean isEmpty() {
        return currentIndex == 0;
    }

    private void ensureCapa() {
        int newSize = MyStack.length * 2;
        MyStack = Arrays.copyOf(MyStack, newSize);
    }

    public int getSize() {
        return currentIndex;
    }

    public void push(E element) {
        if (currentIndex >= CAPACITY) {
            ensureCapa();
        }

        MyStack[currentIndex] = element;
        currentIndex++;
    }

    public E pop() {
        E temp = MyStack[currentIndex];
        MyStack[currentIndex] = null;
        currentIndex--;
        return temp;
    }

    public E peek() {
        return MyStack[currentIndex - 1];
    }

    public void display() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(MyStack[i]);
        }
    }

}
