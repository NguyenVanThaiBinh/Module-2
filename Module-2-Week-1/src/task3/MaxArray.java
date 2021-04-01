package task3;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Input size of array(<10) : ");
             size = scanner.nextInt();
        }while (size>10);

        int[] arr = new int [size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*10);
        }
        System.out.println("Array is: ");
        for (int x: arr) {
            System.out.print(x+ "  ");

        }
        int max = arr[0];
        for(int i =1;i < arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Max value is: "+max);
    }
}
