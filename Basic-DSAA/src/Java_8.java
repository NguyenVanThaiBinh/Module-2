import java.util.Scanner;

public class Java_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean kt1 = true; //kiem tra tang
        boolean kt2 = true; // kiem tra giam
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) kt1 = false;
            if (arr[i] >= arr[i - 1]) kt2 = false;
        }

        if (kt1 || kt2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
