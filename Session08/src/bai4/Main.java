package bai4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.input();
        System.out.println(shape.toString());


        Triangle triangle = new Triangle();
        triangle.input();
        System.out.println("Area : " + triangle.getArea());
        System.out.println("Perimeter : " + triangle.getPerimeter());
        System.out.println(triangle);

    }
}
