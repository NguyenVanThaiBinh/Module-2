package com.BinhHu.DSAJames;


import java.util.*;

public class MyList<E> { // E này là gì?

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 2;
    private Object elements[]; //tạo một mảng có thuộc tính là đối tượng



    public MyList() {
        elements = new Object[DEFAULT_CAPACITY]; //khai báo mảng có số lượng là 10
    }

    private void ensureCapa() {
        int newSize = elements.length * 2; // nhân đôi độ dài mange elements

        elements = Arrays.copyOf(elements, newSize); // tạo mảng mới cùng tên nhưng có gấp đôi độ dài
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) { //trường hợp lỗi thì thông báo!!!
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public int length() {
        return elements.length;
    }
}
