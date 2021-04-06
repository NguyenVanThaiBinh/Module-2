package task4;

import java.util.Scanner;

public class Fan {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    public Fan() {

    }

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int speed = SLOW;
    boolean on = true;
    private double radius = 5;
    private String color = "blue";

    public String toString() {
        if (this.on == true) {
            return "Fan with speed: " + this.speed + "  radius: " + this.radius
                    + " fan is on";
        } else
            return "Fan with speed: " + this.speed + "  radius: " + this.radius
                    + " fan is off";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yello");
        fan1.setOn(false);
        System.out.println(fan1.toString());
    }


}
