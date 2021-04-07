package task1;

public class Point3D extends Point2D{
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
       super(x,y);
        this.z = z;
    }

    private float z =0.0f;
    public Point3D(){

    }
    public void setXYZ(float x,float y,float z){
    super.setXY(x,y);
    this.z = z;
    }
    public float[] getXYZ(){
        float[] arr ={super.getX(),super.getY(),z};
        return arr;
    }
    public String toString(){
        return "("+super.getX()+","+super.getY()+" "+z+" )";
    }



}
