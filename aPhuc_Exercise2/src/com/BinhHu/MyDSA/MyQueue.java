package com.BinhHu.MyDSA;

public class MyQueue<E> {
    MyLinkedList<E> MyQueue;
    int size;

    MyQueue(){
        MyQueue = new MyLinkedList<>();
    }

    public void enQueue(E element ){
        MyQueue.addLast(element);
        size++;
    }

    public E deQueue(){
         E temp = MyQueue.removeFirst();
        size--;
        return temp;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(MyQueue.get(i));
        }
    }


}
