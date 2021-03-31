package Task2;

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("What your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                for(int i = 5; i>= 0;i--){
                    for(int j = 0 ; j <= i;j++){
                        System.out.printf("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Draw the square");
                for(int i = 5; i>= 1;i--){
                    for(int j = 0 ; j <= 5;j++){
                        System.out.printf("* ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("Draw the rectangle");
                for(int i = 5; i>= 0;i--){
                    for(int j = 0 ; j <= 5;j++){
                        System.out.printf("* ");
                    }
                    System.out.println("");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
