package com.BinhHu.DSAJames;

import java.util.Stack;

public class StackDemo_1 {
    public static void main(String[] args) {
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }
        Stack<String> demoStack = new Stack<>();

        demoStack.push("A");
        demoStack.push("B");
        demoStack.push("C");
        System.out.println(demoStack);
    }




}
