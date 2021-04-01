package task3;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.print("Input size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Please input size < 20.");
            }
        }while (size > 20);

        int[] array = new int [size];
        for(int i = 0;i< array.length;i++){
            System.out.print("Input array at index " + i+": ");
            array[i] =scanner.nextInt();
        }
        System.out.println("Array is :");
        for (int x:array) {
            System.out.print(x+" ");
        }
//        reverse array
        for(int i = 0;i< array.length/2;i++){
            int reverse = array[i];
            array[i] = array[(array.length)-1-i];
            array[(array.length)-1-i] = reverse;
        }
        System.out.println("");
        System.out.println("After reverse:");
        for (int x:array) {
            System.out.print(x+" ");
        }
    }


}
