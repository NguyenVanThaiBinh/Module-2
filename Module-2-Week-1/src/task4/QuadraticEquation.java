package task4;

import java.util.Scanner;

public class QuadraticEquation {
    Scanner scanner = new Scanner(System.in);
    double a;
    double b;
    double c;

    public double getA() {
        System.out.println("Welcom my calculator!");
        System.out.println("Input a:");
        return this.a = scanner.nextDouble();
    }

    public double getB() {
        System.out.println("Input b:");
        return this.b = scanner.nextDouble();
    }

    public double getC() {
        System.out.println("Input c:");
        return this.c = scanner.nextDouble();
    }




    public QuadraticEquation(){

    }


    public double getDiscriminant() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {

        double denta = getDiscriminant();
        return (-(this.b) + Math.pow(denta, 0.5)) / 2;

    }

    public double getRoot2() {

        double denta = getDiscriminant();
        return (-(this.b) - Math.pow(denta, 0.5)) / 2;

    }
}
