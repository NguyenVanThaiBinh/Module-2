package com.BinhHu.Not.MyDSA;

import java.util.LinkedList;

public class YourStackFromLinkedList<E> {

    LinkedList<E> YourStack = new LinkedList();

    public void push(E element) {
        YourStack.addLast(element);
    }
    public E pop(){
        E temp = YourStack.removeLast();
        return temp;

    }
    public E peek(){
        return YourStack.peek();
    }
    public void display(){
        for (int i = 0; i < YourStack.size(); i++) {
            System.out.println(YourStack.get(i));
        }
    }

}
