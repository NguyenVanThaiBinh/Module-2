package com.BinhHu.SortAlgorithms;

public class Demo {
    public void BubbleDemo(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 1, 9};
        Demo bubble = new Demo();
        bubble.BubbleDemo(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
