package task4;

public class Circle {
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(){
        radius = 1;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
         return "Circle is radius: "+this.radius
                +"  color: "+this.color;
    }




}