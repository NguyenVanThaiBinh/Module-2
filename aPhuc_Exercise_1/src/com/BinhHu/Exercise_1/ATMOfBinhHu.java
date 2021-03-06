package com.BinhHu.Exercise_1;

import java.util.*;

public class ATMOfBinhHu {


    static String inPutKey(Scanner scanner) {
        String key;
        int count = 0;

        while (true) {
            key = scanner.nextLine();
            if (key.equals("A") || key.equals("D") || key.equals("W") || key.equals("H") || key.equals("X")) break;
            System.out.println("Bạn nhập sai chức năng!");
            System.out.println("Bấm nút theo menu để tiếp tục giao dịch");
            count++;
            if (count % 4 == 0){
                getMenuLoop();
            }
        }

        return key;
    }

    static void getMenu() {
        System.out.println("Ngân hàng ABC kính chào quý khách: " + Account.name);
        System.out.println("Menu:");
        System.out.println("1. Nhấn A để kiểm tra tài khoản.");
        System.out.println("2. Nhấn D để nạp tiền.");
        System.out.println("3. Nhấn W để rút tiền.");
        System.out.println("4. Nhấn H để xem lịch sử 3 lần gần đây nhất.");
        System.out.println("5. Nhấn X để thoát.");
        System.out.println("=================================");
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println();
    }

    static void getMenuLoop() {

        System.out.println("Menu:");
        System.out.print("1. Nhấn A để kiểm tra tài khoản.  ");
        System.out.println("2. Nhấn D để nạp tiền.");
        System.out.print("3. Nhấn W để rút tiền.  ");
        System.out.println("4. Nhấn H để xem lịch sử 3 lần gần đây nhất.");
        System.out.println("5. Nhấn X để thoát.");

    }


}
