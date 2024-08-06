package Common;

import java.util.Scanner;

public class QuadraticEquation {
    private double a ;
    private double b ;
    private double c ;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double  getDiscriminant(){
        return (b*2)-(4*a*c);
    }

    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant())/(2*a));
    }

    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())/(2*a));
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter number a :");
                a = Double.parseDouble(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("value valid");
            }
        }

        while (true){
            try {
                System.out.println("Enter number b :");
                b = Double.parseDouble(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("value valid");
            }
        }

        while (true){
            try {
                System.out.println("Enter number c :");
                c = Double.parseDouble(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("value valid");
            }
        }
    }
}
