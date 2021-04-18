package com.BinhHu.MyDSA;

public class Test_MyQueueFromArray {
    public static void main(String[] args) {
        MyQueueFromArray<String> MyQueue = new MyQueueFromArray();
        MyQueue.enQueue("Binh");
        MyQueue.deQueue();

        MyQueue.display();

//        MyQueue.enQueue("Binh");
//        MyQueue.enQueue("Hu");
//        MyQueue.enQueue("Mam");
//        MyQueue.enQueue("Nem");
//
//        MyQueue.display();
//        System.out.println("-------------");
//        System.out.println(MyQueue.deQueue());
//        System.out.println("---------");
//        MyQueue.display();
    }

}
