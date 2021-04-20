package com.BinhHu.SeachAlgorithms;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        SeachBinary sBinary = new SeachBinary();
        int temp = sBinary.SeachBinary(arr, 8);
        System.out.println(temp);

    }

    public static int binarySeach(int[] list, int key) {
        int low = 0;
        int high = list.length; //xét theo index

        while (high > low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid])
                return mid;
            else low = mid + 1;
        }
        return -1;
    }
}
