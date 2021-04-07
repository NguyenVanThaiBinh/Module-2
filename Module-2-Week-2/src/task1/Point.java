package task1;

public class Point {
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {

    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(double x,double y){
         return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    public double distance(Point newobject) {
        return distance(newobject.getX(), newobject.getY());
    }

    private double x, y;
}
