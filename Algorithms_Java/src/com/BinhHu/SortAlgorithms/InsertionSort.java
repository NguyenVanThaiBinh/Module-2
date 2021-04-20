package com.BinhHu.SortAlgorithms;

public class InsertionSort {
    public void InsertSort(int[] arr) {
                    //  Start: 9, 8, 5, 7, 4

        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i]; //key là tk  i[1]
            int j = i - 1; // j là các tk đã được xếp,những tk đằng sau key
            while (j >= 0 && arr[j] > key) { //qua mỗi vòng lặp giảm j đi 1, nghĩa là các phần tử sau key
                arr[j + 1] = arr[j];  //thực hiện dịch trước một lần để INSERT vào
                j = j - 1; //giảm các đã xét đi 1
            }
            arr[j + 1] = key; //lưu giá trị key
        }


    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 5, 7, 4};
        InsertionSort insert = new InsertionSort();
        insert.InsertSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
