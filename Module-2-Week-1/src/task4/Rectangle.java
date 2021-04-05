package task4;
public class Rectangle {
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    float length,width;

    public Rectangle(){

    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
   }
   public String toString(){
        return "Rectangle with length: "+this.length+ "  width: "+this.width;
   }
}