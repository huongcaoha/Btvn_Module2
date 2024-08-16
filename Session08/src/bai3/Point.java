package bai3;

public class Point {
    private Float x = 0.0f ;
    private Float y = 0.0f ;

    public Point(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
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
    public void setXY(float x, float y){
        this.x = x ;
        this.y = y;
    }

    public float[] getXY (){
         float[] rs = {this.x ,this.y};
         return rs;
    }

    @Override
    public String toString() {
        return "( " + getX() + " , " + getY() + " )";
    }
}
