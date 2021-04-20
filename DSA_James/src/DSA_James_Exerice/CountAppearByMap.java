package DSA_James_Exerice;

import java.util.Scanner;

public class CountAppearByMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringBuilder text = new StringBuilder(inputString);
            // xoá dấu không mong muốn
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.'||text.charAt(i) == ','||text.charAt(i) == '!') {
              text.delete(i, i + 1);
                i--;


            }

        }

        System.out.println(text);


    }
}
