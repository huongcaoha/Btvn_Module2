package bai1.entity;


import bai1.myInterface.Resizable;

public class Circle implements Resizable {
    private double radius ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius += (this.radius*percent)/100  ;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

   @Override
    public void displayData(){
        System.out.printf("Radius : %.2f   -> Area : %.2f  \n",radius,getArea());
    }
}
