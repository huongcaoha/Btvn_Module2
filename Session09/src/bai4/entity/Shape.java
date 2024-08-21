package bai4.entity;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private String color ;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void display(){
        System.out.println("Color : " + color);
    }
}
