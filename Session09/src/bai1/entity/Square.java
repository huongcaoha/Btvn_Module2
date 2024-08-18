package bai1.entity;


import bai1.myInterface.Resizable;

public class Square implements Resizable  {
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

    @Override
    public void resize(double percent) {
            this.side += (side*percent)/100 ;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
    public void displayData(){
        System.out.printf("Side : %.2f  -> Area : %.2f \n" , side,getArea());
    }
}
