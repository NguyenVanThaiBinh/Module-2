package Task2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = scanner.nextInt();


        for(int j =2;j<=number;j++){
            if(j==2) System.out.println(j);
            boolean check = true;
            for(int i =2;i<(j);i++){
                if( j % i == 0){
                    check = false;
                }



              }
            if(check)
                System.out.println(j);



        }
    }

}
