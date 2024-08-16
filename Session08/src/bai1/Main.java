package bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10.5,"black");
        System.out.println(circle.toString());
        System.out.println("Area : " +circle.getArea());
        System.out.println("Premeter : " + circle.getPrimeter());

        System.out.println();
        Cylinder cylinder = new Cylinder(10.5,"red", 15.0);
        System.out.println(cylinder.toString());
        System.out.println("Area : " +cylinder.getArea());
        System.out.println("Premeter : " + cylinder.getPrimeter());
        System.out.println("Volume : " + cylinder.calVolume());
    }
}
