package bai1.entity;

import bai1.myInterface.Resizable;

public class Rectangle implements Resizable  {
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


    @Override
    public void resize(double percent) {
            this.width += (width*percent)/100 ;
            this.height += (height*percent)/100 ;
    }

    @Override
    public double getArea() {
        return  width*height;
    }

    public void displayData(){
        System.out.printf("Width :  %.2f  , height : %.2f  -> Area : %.2f \n",width,height,getArea() );
    }
}
