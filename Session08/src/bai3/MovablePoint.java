package bai3;

public class MovablePoint extends Point {
    private Float xSpeed = 0.0f;
    private Float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(Float x, Float y, Float xSpeed, Float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Float getxSpeed() {
        return xSpeed;
    }
    public float[] getSpeed(){
        float[] rs = {this.xSpeed,this.ySpeed};
        return rs ;
    }

    public void setxSpeed(Float xSpeed) {
        this.xSpeed = xSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+ " , speed = ( " + getxSpeed() + " , " + getySpeed() + " )";
    }

    public Float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(Float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move(){
        float x= super.getX() + xSpeed;
        float y = super.getY() + ySpeed;
        super.setX(x);
        super.setY(y);
        return this ;
    }
}
