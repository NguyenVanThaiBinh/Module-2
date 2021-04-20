package com.BinhHu.SortAlgorithms;

public class SelectionSort {
    void SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // seach min value in arr
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }
            //swap min value to first arr
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        //CACH 2

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                if(arr[j]<arr[i]){
//                    int temp = arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 1, 2};
        SelectionSort selection = new SelectionSort();
        selection.SelectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
