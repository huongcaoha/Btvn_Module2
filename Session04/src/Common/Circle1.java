package Common;

public class Circle1 {
    private double radius = 1.0 ;
    private String color = "red" ;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (Math.PI * (Math.pow(radius,2)));
    }
}
