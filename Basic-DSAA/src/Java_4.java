import java.sql.Array;
import java.util.Scanner;

public class Java_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] a = new double[n];
        double[] b = new double[n+1];


        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        for (int i = n; i >= k+1; i--){
            b[i] = b[i-1];
        }
        b[k] = x;
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%.0f ",b[i]);
        }





    }
}
