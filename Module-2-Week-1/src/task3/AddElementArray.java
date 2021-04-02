package task3;

import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};

        for (int x : arr) {
            System.out.print(x + "  ");

        }
        System.out.print("Input value to add: ");
        int value = scanner.nextInt();
        System.out.print("Input index: ");
        int index = scanner.nextInt();
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("After add:");
        for (int x : newArr) {
            System.out.print(x + "  ");

        }

    }
}
