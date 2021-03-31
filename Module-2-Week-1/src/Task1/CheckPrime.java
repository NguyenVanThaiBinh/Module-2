package Task1;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number:");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("That is NOT prime number ");
        }
        else{
            int i =2;
            boolean check = true;
            while (i <=Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number+" is Prime number");

            }
            else
                System.out.println(number+" is NOT Prime number");
        }

    }
}
