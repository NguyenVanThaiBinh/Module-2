package com.BinhHu.MyLinkedList;

public class MyLinkedList {
    private  Node head;  //kiểu dữ liệu Node tên là head
    private  int numNodes; // số Node

    public MyLinkedList(Object data) {  //phương thức gán giá trị head qua đối tượng Node
        head = new Node(data);
    }
    public MyLinkedList() {

    }

    public class Node {
        public Node next;

        private Object data;    //kiểu dữ liệu đối tượng, tên là data

        public Node(Object data) { //phương thức Node nhận  vào giá trị data
            this.data = data;
        }


    }


    public void add(int index, Object data) {
        Node temp = head; //tạo một biến tạm temp lưu giá trị head
        Node holder; //tạo một biến holder để giữ

        for(int i=0; i < index-1 && temp.next != null; i++) { //vòng lặp
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
