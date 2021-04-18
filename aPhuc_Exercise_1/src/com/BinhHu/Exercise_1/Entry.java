package com.BinhHu.Exercise_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Entry extends ATMOfBinhHu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        getMenu();
        int count = 1;


        LinkedList history = new LinkedList();

        String key = " ";

        while (!key.equals("X")) {
            if (count % 4 == 0){
                getMenuLoop();
            }
            key = inPutKey(scanner);
            count++;

            switch (key) {
                case "D": {
                    System.out.println("Giao dịch nạp tiền");
                    System.out.print("Nhập số tiền: ");
                    int money = scanner1.nextInt();
                    System.out.println("Bạn vừa nạp thành công " + money + " vào TK.");
                    Account.amount += money;
                    history.add("Nạp tiền: " + money + " VND");
                    System.out.println("Số dư tài khoản là: " + Account.amount + " VND");
                    System.out.println("----------------");
                    System.out.println("");

                    break;
                }
                case "A": {
                    System.out.println("Số dư tài khoản: " + Account.amount + " VND");
                    System.out.println("Bấm nút tiếp theo để giao dịch.");
                    System.out.println("----------------");
                    System.out.println("");

                    break;
                }
                case "W": {
                    System.out.println("Giao dịch Rút Tiền");
                    System.out.println("Vui lòng nhập số tiền: ");
                    int money = scanner2.nextInt();
                    Account.amount -= money;
                    if (Account.amount < 0) {
                        System.out.println("Số dư không đủ!");
                        System.out.println("Bấm nút tiếp theo để giao dịch.");
                        Account.amount += money;
                        System.out.println("----------------");
                        System.out.println("");
                        break;
                    }
                    System.out.println("Bạn vừa rút thành công " + money + " VND vào TK.");

                    history.add("Rút tiền: " + money + " VND");
                    System.out.println("Số dư tài khoản là: " + Account.amount + " VND");
                    System.out.println("----------------");
                    System.out.println("");
                    break;

                }
                case "H": {
                    System.out.println("Lịch sử sử dụng: ");
                    if(history.size()<3){
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println(history.get(i));
                        }
                    }
                    else{
                        for (int i = history.size()-1; i>=history.size()-3; i--) {
                            System.out.println(history.get(i));
                        }
                    }
                    System.out.println("----------------");
                    System.out.println("");

                    break;
                }


            }


        }

        if (key.equals("X")) {
            System.out.println("Cám ơn quý khách đã sử dụng ATM.");
        }


    }


}
