package task3;

import java.util.Scanner;

public class MaxArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array length x and y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = (int) (Math.random() * 100
                );
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
        int max = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < arr[i][j]) max = arr[i][j];
            }
        }
        System.out.println("GTLN: " + max);
    }

}
