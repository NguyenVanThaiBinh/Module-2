import java.util.Scanner;

public class Java_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr1 = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int length2 = scanner.nextInt();

        int[] arr2 = new int[length2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[length + length2];

        for (int i = 0; i < arr1.length; i++) { //chen arr1 vao arr3
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {//chen arr2 vao arr3
            arr3[arr1.length + i] = arr2[i];
        }
        int temp;
        for (int i = 0; i < arr3.length-1; i++) {
            for (int j = i ; j < arr3.length; j++) {

                if (arr3[i] > arr3[j]) {
                    temp = arr3[j];
                    arr3[j] = arr3[i];
                    arr3[i] = temp;
                }
            }
        }
        for (int x : arr3
        ) {
            System.out.print(x + " ");

        }
    }
}
