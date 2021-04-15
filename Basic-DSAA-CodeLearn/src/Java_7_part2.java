import java.util.Scanner;


public class Java_7_part2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }//insert in arr
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = 0;
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j]; //sap xep gia tri tang dan
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {  //
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) count ++;
            }
            int times = 0;
            for (int k = 0; k <= i; k++) {
                if (a[i] == a[k]) {
                    times ++;
                }
            }
            if (times == 1) { //in 1 tk 1 lan
                System.out.print(a[i] + " - " + count + "; ");
            }
        }
    }
}


