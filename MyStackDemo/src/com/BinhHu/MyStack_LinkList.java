package com.BinhHu;

import java.util.LinkedList;

public class MyStack_LinkList<E> {

     private LinkedList<E> elements;

     public MyStack_LinkList(){
         elements = new LinkedList<>();
     }

     public void push(E entry){
         this.elements.push(entry);

     }
     public E peek(){
         E entry = elements.get(0);
         return entry;
     }
     public E pop(){

           E entry = elements.removeFirst();
        return entry;
     }
     public void display(){
         for (int i = 0; i < elements.size(); i++) {
             System.out.println(elements.get(i));
         }
     }


}
