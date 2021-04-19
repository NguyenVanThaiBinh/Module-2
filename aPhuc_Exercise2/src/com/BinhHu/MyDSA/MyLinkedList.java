package com.BinhHu.MyDSA;

public class MyLinkedList<E> {
    //khi nào cũng cần 1 Node temp để duyệt và làm rất nhiều thứ trong LinkedList
    
    Node head; //head này khác head head-1, đây là cái head tạm thời thôi
    int numNodes = 0;
    public MyLinkedList(){
        head = new Node(); //head này là head-2, được tạo mới trong hàm
        head.next = null; //next này cũng là một đối tượng và được gán là null
        numNodes++;
    }

    public MyLinkedList(E data) { //hàm tạo giá trị đầu tiên
        head = new Node(data); //truyền giá trị vào head đầu
        head.next = null;
        numNodes++;
    }

    public void addLast(E element) { //thêm vào cuối
        if (head.data == null){   //nếu head chưa có giá trị thì phải tạo head mới
            head = new Node(element); //sau đó mới có thể truyền giá trị vào
        } else { //nếu đã có nút head thì thêm Node mới vào
            Node temp = head; // tạo một Node tạm để lưu giá trị Node head
            while (temp.next != null) { // chạy đến cuối phần tử, rồi mới thêm vào
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

        Node holder = head; //giữ giá trị đầu
        Node temp = head;//tạo một Node tạm để ko bị mất Node head
        head= temp.next; //tạo một Node head MỚI bằng giá trị tiếp theo temp.next
        temp = null;//temp.next để liên kết nút head mới với các liên kết trước trong LinkedList
        numNodes--;//gán nút head ban đầu bằng nút temp
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
