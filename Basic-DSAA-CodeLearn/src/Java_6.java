import java.util.Scanner;


public class Java_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];
        String newArr = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                newArr += arr[i] + " ";
            }
        }
        System.out.println(newArr);

    }

    public static boolean isPrime(int number) {
        boolean check = true;
        if (number <= 1) {
            check = false;

            return check;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}

