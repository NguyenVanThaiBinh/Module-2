import java.util.Scanner;
import java.util.Stack;

public class Java_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Stack<Integer> newStack = new Stack<>();
        Stack<Integer> sStack = new Stack<>();
        int count = 0;
        while (number > 0) {
            newStack.push(number % 2);
            count++;
            number = (number / 2);
        }
        for (int i = count - 1; i >= 0; i--) {
            sStack.push(newStack.get(i));
        }
        for (int x : sStack) {
            System.out.print(x);

        }


    }
}
