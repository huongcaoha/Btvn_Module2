package bai2.entity;


import bai1.myInterface.Resizable;
import bai2.myInterface.Colorable;

public class Circle implements Colorable {
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

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public void displayData(){
        System.out.println("Circle");
        System.out.printf("Radius : %.2f   -> Area : %.2f  \n",radius,getArea());
    }

    @Override
    public void howToColor() {

    }
}
