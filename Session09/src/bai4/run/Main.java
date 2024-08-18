package bai4.run;

import bai4.entity.Circle;
import bai4.entity.Rectangle;
import bai4.entity.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> arr = new ArrayList<>();

        Rectangle rectangle = new Rectangle("Red",15.5,32.1);
        arr.add(rectangle);

        Circle circle = new Circle("Blue",36.5);
        arr.add(circle);

        for(Shape s : arr){
            s.display();
            System.out.println("Area : " + s.getArea());
            System.out.println();
        }
    }
}
