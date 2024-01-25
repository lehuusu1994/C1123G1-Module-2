package point2d_point3d;

public class Point3D extends Point2D{
    private  float z = 0.0f;



    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float [] getXYZ (){
        float [] coordinates = new float[3];
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
        return coordinates;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z +")";
    }
}
