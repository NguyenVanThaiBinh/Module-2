package task3;

import java.util.Scanner;

public class ValueArray {
    public static void main(String[] args) {
        String[] names = {"Michiel","Edele","Thor","Thor","Iron Man"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String inputNames = scanner.nextLine();
        boolean check = true;
        for(int i = 0 ; i< names.length;i++){

            if(names[i].equals(inputNames)){
                System.out.println("Positione of "+inputNames+" is: "+ i);
                check = false;
                break;
            }


        }
        if(check == true){
            System.out.println("The text isn' t exsist");
        }

    }
}
