package com.BinhHu.MyDSA;

public class MyStack<E>  {
    MyLinkedList<E> MyStack;
    int size;


    MyStack() {
        MyStack = new MyLinkedList<>();
    }

    public void push(E element) {
        MyStack.addLast(element);
        size++;
    }

    public E pop() {
        size--;
        return MyStack.removeLast();

    }

    public E peek() {
       return MyStack.get(size-1);
    }
    public void display(){

        for (int i = 0; i < size; i++) {
            System.out.println(MyStack.get(i));
        }

    }

}
