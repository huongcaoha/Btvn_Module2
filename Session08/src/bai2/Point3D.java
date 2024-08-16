package bai2;

public class Point3D extends Point2D {
    private Float z = 0.0f ;

    public Point3D(Float x, Float y, Float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }
    public void setXYZ(Float x , Float y , Float z){
        super.setXY(x,y);
        this.z = z ;
    }

    public float[] getXYZ(){
        float[] rs = {getX(),getY(),z};
        return rs ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +" , " +
                "y=" + getY()+" , " +
                "z=" + z +
                '}';
    }
}
