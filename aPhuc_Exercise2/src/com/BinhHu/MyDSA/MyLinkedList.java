package com.BinhHu.MyDSA;

public class MyLinkedList<E> {
    Node head;
    int numNodes = 0;
    public MyLinkedList(){
        head = new Node();
        head.next = null;
        numNodes++;
    }

    public MyLinkedList(E data) {
        head = new Node(data);
        head.next = null;
        numNodes++;
    }

    public void addLast(E element) {
        if (head.data == null){
            head = new Node(element);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node addNode = new Node(element);
            temp.next = addNode;
            addNode.next = null; //tk nay la tk cuoi
        }

        numNodes++;
    }

    public E removeLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = null;
        numNodes--;
        return (E) holder.data;
    }
    public  E removeFirst(){
        Node holder ;
        holder = head;
        Node temp = head;
        head= temp.next;
        temp = null;
        numNodes--;
        return (E)holder.data;
    }
    public E get(int index){

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }


    public int getSize() {
        return numNodes;
    }


}
