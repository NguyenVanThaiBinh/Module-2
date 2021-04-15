package com.BinhHu;



public class MyStack<E> {
    public int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private E[] elements;

    public MyStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return (size == -1);
    }

    public boolean isFull() {
        return (size == DEFAULT_CAPACITY );
    }

    public void push(E entry) {
        if (this.isFull()) {
            System.out.println("Stack Overflow");
        } else {
            elements[size] = entry;
            size++;
            System.out.println(size);

        }


    }

    public E pop() {
        if (this.isEmpty()) {
            System.out.println("Stack underflow.");
        }
        E entry = elements[size--];
        elements[size] = null;
//        size--;



        return entry;
    }

    public E peek() {
        if (this.isEmpty()) {
            System.out.println("Stack underflow.");
        }
        return elements[size];
    }

    public void disPlay() {
        for (int i = elements.length -1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }
}
