package task4;


import java.util.Scanner;

public class Rectangle {
    double height, width;
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }





    public double getArea() {
        return this.height * this.width;
    }
    public double getPerimeter() {
        return 2*(this.height + this.width);
    }
    public String display(){
        return "Rectangle width and height is:"+width+"  "+ height;
    }


}

