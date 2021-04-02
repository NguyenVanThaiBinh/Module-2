package task3;

import java.util.Scanner;

public class ConverseTemple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Converse F -> C");
        System.out.println("2. Converse C -> F");
        System.out.println("3. Out");
        System.out.println("Input your choice: ");
        System.out.printf("%9.2s", "Hi there!"); //9 is padding (chen phia tr)
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Input fahrenheit temple: ");
                double ftemple = scanner.nextDouble();
                System.out.printf("The Celsius is %.2f",converseC(ftemple));
                break;
            case 2:
                break;
            case 3:
                break;
            default:

        }
    }
    public static double converseF( double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;

    }
    public static double converseC( double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;

    }
}
