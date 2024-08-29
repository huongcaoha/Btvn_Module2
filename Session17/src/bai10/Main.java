package bai10;

import bai1.Common;

public class Main {
    public static void main(String[] args) {
        int number = Common.getNumber("Enter radius to calculater : ");
        while (number <= 0){
            System.err.println("Enter number > 0 !");
            number = Common.getNumber("Enter radius to calculater : ");
        }
        double area = Math.PI*Math.pow(number,2);
        System.out.println("Area of circle has radius " + number + " = " + area);
    }
}
