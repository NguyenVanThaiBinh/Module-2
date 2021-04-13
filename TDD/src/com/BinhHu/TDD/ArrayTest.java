package com.BinhHu.TDD;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 10, 5, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;

                }
            }

        }
        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}
