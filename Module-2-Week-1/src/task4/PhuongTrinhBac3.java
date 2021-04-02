package task4;

import java.util.Scanner;

class PhuongTrinhBac0 {
    float a;
    float b;
    float c;
    Scanner scanner = new Scanner(System.in);

    void nhapHeSo() {
        System.out.println("Nhap he so a: ");
        a = scanner.nextFloat();
        System.out.println("Nhap he so b: ");
        b = scanner.nextFloat();


    }

    void xacDinhNghiem() {
        if (a == 0) {
            if (b == 0) {

                System.out.println("Phuong trinh vo so nghiem!");


            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }

        } else {
            System.out.println("Nghiem la: " + (c - b) / a);
        }
    }
}

 public class PhuongTrinhBac3 {
    public static void main(String[] args) {
        PhuongTrinhBac0 PTB0 = new PhuongTrinhBac0();
        PTB0.nhapHeSo();
        PTB0.xacDinhNghiem();
        System.out.print("sdfsdf " + 3);
    }

}
