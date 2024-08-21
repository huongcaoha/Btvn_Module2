package bai4.run;

import bai4.entity.Circle;
import bai4.entity.Rectangle;
import bai4.entity.Shape;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

        String filename = "data.txt";
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)) ) {
//            out.writeObject(arr);
//            System.out.println("Save successfully !");
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        List<Shape> newArr = new ArrayList<>();
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            newArr = (List<Shape>) in.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        for(Shape s : newArr){
            s.display();
        }
    }
}
