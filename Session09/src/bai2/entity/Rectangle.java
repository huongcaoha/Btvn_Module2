package bai2.entity;

import bai1.myInterface.Resizable;
import bai2.myInterface.Colorable;

public class Rectangle  implements Colorable {
    private double width ;
    private double height ;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return  width*height;
    }

    public void displayData(){
        System.out.println("Retangle");
        System.out.printf("Width :  %.2f  , height : %.2f  -> Area : %.2f \n",width,height,getArea() );
    }

    @Override
    public void howToColor() {

    }
}
