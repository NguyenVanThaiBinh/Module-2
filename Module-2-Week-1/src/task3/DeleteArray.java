package task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int size = scanner.nextInt();
        System.out.println("Array is: ");
        int[] array = printArray(size);
        System.out.println(" ");
        System.out.println("Input valua need to delete: ");
        int value = scanner.nextShort();
        System.out.println("Array after delete: ");
        deleteArray(value,array);
    }

    public static int[] printArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + "  ");
        }
        return arr;

    }

    public static void deleteArray(int value, int[] array) {
        int count =0;
        for (int i = 0; i < array.length; i++) {
            for(int j=i+1;j<array.length;j++){
                if (value == array[i]) {
                    count++;
                    for(int z = i;z<array.length-count;z++){
                        array[z] = array[z+1];
                    }
                }
            }
        }
        for(int i=0;i<array.length-count;i++){
            System.out.printf(" %d ",array[i]);
        }
    }

}
