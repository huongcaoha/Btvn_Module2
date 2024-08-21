package bai4.entity;

import java.io.Serializable;

public class Circle extends Shape implements  Serializable {
    private double radius ;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void display() {
        System.out.println("Circle");
        super.display();
        System.out.println("Radius : " + radius);
    }
}
