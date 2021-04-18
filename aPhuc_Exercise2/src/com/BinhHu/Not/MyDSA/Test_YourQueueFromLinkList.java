package com.BinhHu.Not.MyDSA;

public class Test_YourQueueFromLinkList {
    public static void main(String[] args) {
        YourQueueFromLinkedList<String> YourQueue = new YourQueueFromLinkedList();

        YourQueue.enQueue("Binh");
        YourQueue.enQueue("Hu");
        YourQueue.enQueue("Mam");
        YourQueue.enQueue("Nem");
        YourQueue.display();
        System.out.println("-----------");
        YourQueue.deQueue();
        YourQueue.display();
        System.out.println(YourQueue.getSize());
    }
}
