package task4;
import java.util.Scanner;

     class PhuongTrinhBac2 {
    float a;
    float b;
    float c;

    void nhapCacHeSo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Mời nhập hệ số a: ");
        a = input.nextFloat();
        System.out.print("Mời nhập hệ số b: ");
        b = input.nextFloat();
        System.out.print("Mời nhập hệ số c: ");
        c = input.nextFloat();
    }

    double tinhBietThucDelta() {
        return b * b - 4 * a * c;
    }

    void xacDinhNghiem() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm!");
                } else {
                    System.out.println("Phương trình vô nghiệm!");
                }
            } else {
                System.out.println("Phương trình có 1 nghiệm, x = " + (-c / b));
            }
        } else {
            double delta = tinhBietThucDelta();//có lời gọi (calling) đến phương thức khác
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép, x1 = x2 = " + (-b / (2 * a)));
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}

class TestPhuongTrinhBac2 {
    public static void main(String[] args) {
        PhuongTrinhBac2 objPTB2 = new PhuongTrinhBac2();
        objPTB2.nhapCacHeSo();
        objPTB2.xacDinhNghiem();
    }
}