package com.BinhHu.SortAlgorithms;

public class BubbleSort {
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false; //chỉ cần duyệt đến phần tử length - 1 vì hàm là j+1
            for (j = 0; j < n - i - 1; j++) {//đưa tk lớn nhất lui sau cùng
                if (arr[j] > arr[j + 1]) { //n-i-1 là giảm số lần lặp đi 1 vì sắp được 1 tk rồi
                    // swap arr[j] và arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có phần tử nào để hoán đổi
            // bên trong vòng lặp thì Break
            if (swapped == false)
                break;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 8, 4, 2, 1};

        System.out.println("Mảng ban đầu:");
        printArray(arr, arr.length);
        bubbleSort(arr, arr.length);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr, arr.length);
    }
}
