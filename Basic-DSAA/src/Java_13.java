import java.util.Scanner;


public class Java_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();




        char[] arr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);

        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }


    }
}
