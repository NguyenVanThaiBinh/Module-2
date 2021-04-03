package task4;

import java.util.Scanner;

public class Excute{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your width and height:");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());


    }
}
