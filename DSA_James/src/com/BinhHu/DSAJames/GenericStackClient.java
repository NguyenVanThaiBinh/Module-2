package com.BinhHu.DSAJames;

public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");

        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
    }

    public static void main(String[] args) {
        stackOfIStrings();
    }
}
