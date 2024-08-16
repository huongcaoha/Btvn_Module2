package bai3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.5f,5.6f);
        System.out.println("Tostring : " +  point.toString());
        System.out.println("Get XY : " + Arrays.toString(point.getXY()));

        MovablePoint movablePoint = new MovablePoint(1.1f,2.2f,3.3f,4.4f);
        System.out.println("Get speed : " + Arrays.toString(movablePoint.getSpeed()));
        System.out.println("movablePoint : " + movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
