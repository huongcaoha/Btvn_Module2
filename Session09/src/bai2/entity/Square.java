package bai2.entity;


import bai1.myInterface.Resizable;
import bai2.myInterface.Colorable;

public class Square implements Colorable {
    private double side ;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side,2);
    }
    public void displayData(){
        System.out.println("Square");
        System.out.printf("Side : %.2f  -> Area : %.2f \n" , side,getArea());
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}
