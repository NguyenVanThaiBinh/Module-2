import java.util.Scanner;


public class Java_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];


        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();



        for (int i = 0; i < a.length; i++) {
            if (i == k) {
                for (int j = k; j < a.length - 1; j++) {
                    a[j] = a[j + 1];

                }

            }
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        for (int x : b) {
            System.out.print(x + " ");
        }
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }

    }
}
