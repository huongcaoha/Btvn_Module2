package baitap;

import Common.Circle;

public class Baitap1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        System.out.println("Area circle : " + circle.area());
        System.out.println("Primeter circle : " + circle.primeter());
        circle.displayData();
    }
}
