package task4;
public class Rectangle {
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double length;
    private double width;

     public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
         return (length+width)*2;
    }
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }


}