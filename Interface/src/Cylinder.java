public class Cylinder extends Circle implements IVolumeShape{
    private double heightCylinder;

    public Cylinder(double radius, double heightCylinder) {
        super(radius);
        this.heightCylinder = heightCylinder;
    }

    public double getHeightCylinder() {
        return heightCylinder;
    }

    public void setHeightCylinder(double heightCylinder) {
        this.heightCylinder = heightCylinder;
    }

    public Cylinder(){

    }
    @Override
    public double getVolume() {
        return heightCylinder*getArea();
    }
    public void display(){
        System.out.println("Cylinder with radius: "+getRadius());
        System.out.println("HeightCylinder: "+this.heightCylinder);
        System.out.println("Volume: "+ getVolume());
    }
}
