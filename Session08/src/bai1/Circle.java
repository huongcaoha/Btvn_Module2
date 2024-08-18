package bai1;

import java.io.Serializable;

public class Circle implements Serializable {
    private Double radius ;
    private String color ;

    public Circle() {
    }

    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getPrimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius,2));
    }

    @Override
    public String toString() {
        return "Radius : " + radius + "\n" +
                    "Color : " + color ;
    }
}
