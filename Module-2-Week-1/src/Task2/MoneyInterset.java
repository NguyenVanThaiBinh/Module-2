package Task2;

import java.util.Scanner;

public class MoneyInterset {
    public static void main(String[] args) {
        double money;
        int month;
        double rate = 5.5; // year

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input money: ");
        money = scanner.nextDouble();

        System.out.println("Input month:");
        month = scanner.nextInt();

        double total = 0;
        for(int i = 0;i<month;i++){
            total += money * (rate/100/12)* month;
        }
        System.out.println("Interset money: "+total);

    }
}
