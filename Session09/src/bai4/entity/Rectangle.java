package bai4.entity;

public class Rectangle extends Shape{
    private double width ;
    private double height ;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color);
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
    public void display() {
        System.out.println("Retangle");
        super.display();
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
