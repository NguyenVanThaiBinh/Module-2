package com.BinhHu.MyLinkedList;

public class Node {
    Object data;
    Node next;
    Node(Object data){
        this.data = data;
    }

    public Node() {

    }

    Object getData(){
        return this.data;
    }

}
