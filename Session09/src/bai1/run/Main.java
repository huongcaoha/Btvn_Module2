package bai1.run;

import bai1.entity.Circle;
import bai1.entity.Rectangle;
import bai1.entity.Square;
import bai1.myInterface.Resizable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Resizable> shape = new ArrayList<>();

       Circle circle = new Circle(15.5);
       shape.add(circle);

       Rectangle rectangle = new Rectangle(15.0,25.2);
       shape.add(rectangle);

       Square square = new Square(15.0);
       shape.add(square);

        System.out.println("Area of shapes before resize : ");
       for(Resizable s : shape){
            s.displayData();
            s.resize(random.nextDouble(100)+1);
       }

        System.out.println();
        System.out.println("Area of shapes after resize : ");
        for(Resizable s : shape){
            s.displayData();
        }
    }
}
