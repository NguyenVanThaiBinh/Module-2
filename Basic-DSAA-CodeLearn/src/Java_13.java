import java.util.Scanner;
import java.util.Stack;


public class Java_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] sArray = s.split("");
        Stack<String> sStack = new Stack<String>();
        for (int i = 0; i < sArray.length; i++) {
            sStack.add(sArray[i]);
        }
        System.out.println(sStack);

        Stack<String> newStack = new Stack<>();
        for (int i = 0; i < sArray.length; i++) {
            newStack.push(sStack.pop());
        }

        for (int i = 0; i < newStack.size(); i++) {
            System.out.print(newStack.get(i));
        }


    }
}
