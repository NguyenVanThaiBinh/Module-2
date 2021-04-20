package com.BinhHu.SeachAlgorithms;

public class SeachBinary {
    public static int SeachBinary(int[] arr, int key) {
        int low = 0;
        int high = arr.length;
        while (high > low) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key == arr[mid]) {
                return mid;
            } else low = mid + 1;
        }
        return -1;
    }
}
