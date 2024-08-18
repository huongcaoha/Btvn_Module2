package bai4;

import java.util.Scanner;

public class Triangle extends  Shape{
    private double side1 = 1.0 ;
    private double side2 = 1.0 ;
    private double side3 = 1.0 ;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }
    public double getArea(){
        double p = (side1 + side2 + side3 ) / 2 ;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return  super.toString()+

                "side1=" + side1 +"\n" +
                ", side2=" + side2 +"\n" +
                ", side3=" + side3  + "\n";
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        super.input();
       while (true){
           try {
               System.out.println("Enter side1 : ");
               side1 = Double.parseDouble(scanner.nextLine().trim());
               if(side1 > 0){
                   break;
               }else {
                   System.err.println("Enter side1 > 0 !");
               }
           }catch (Exception e){
               System.err.println("side1 invalid !");
           }
       }

        while (true){
            try {
                System.out.println("Enter side2 : ");
                side2 = Double.parseDouble(scanner.nextLine().trim());
                if(side2 > 0){
                    break;
                }else {
                    System.err.println("Enter side2 > 0 !");
                }
            }catch (Exception e){
                System.err.println("side2 invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter side3 : ");
                side3 = Double.parseDouble(scanner.nextLine().trim());
                if(side3 > 0){
                    break;
                }else {
                    System.err.println("Enter side3 > 0 !");
                }
            }catch (Exception e){
                System.err.println("side3 invalid !");
            }
        }
    }
}
