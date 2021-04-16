package com.BinhHu.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {

        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<String> linky = new MyLinkedList("Z");
        linky.addLast("A");
        linky.addLast("B");
        linky.addLast("C");
        linky.display();

        System.out.println("__-____-_____");
        System.out.println(linky.removeFirst());
        System.out.println();
        linky.display();



//        System.out.println();
//        System.out.println("----------");
//        ll.add(4, 9);
//        ll.add(4, 9);
//        ll.printList();
    }
}
