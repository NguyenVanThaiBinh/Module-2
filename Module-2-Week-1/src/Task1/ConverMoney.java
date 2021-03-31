package Task1;


import java.util.Scanner;

public class ConverMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Money:");
        double usd;
        usd =  scanner.nextDouble();

        double vnd = usd*23000;
        System.out.println("To VND is:" + vnd);
    }
}
