package bai2;

public class Point2D {
    private Float x = 0.0f ;
    private Float y = 0.0f ;

    public Point2D(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }
    public void setXY(Float x, Float y){
        this.x = x ;
        this.y = y ;
    }

    public float[] getXY(){
         float[] rs  = {this.x,this.y};
         return rs ;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
