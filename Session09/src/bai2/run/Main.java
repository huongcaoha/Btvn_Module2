package bai2.run;

import bai2.entity.Circle;
import bai2.entity.Rectangle;
import bai2.entity.Square;
import bai2.myInterface.Colorable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colorable> shape = new ArrayList();

        Circle circle = new Circle(13.3);
        shape.add(circle);

        Rectangle rectangle = new Rectangle(35.0,16.0);
        shape.add(rectangle);

        Square square = new Square(20.5);
        shape.add(square);

        for(Colorable s : shape){
            s.displayData();
            if(s instanceof Square){
                s.howToColor();
            }
            System.out.println();
        }
    }
}
