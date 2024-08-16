package bai4;

import java.util.Scanner;

public class Shape {
    private String color ;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color : ");
        color = scanner.nextLine().trim() ;
    }

    @Override
    public String toString() {
        return  "Color : " + color  + "\n";
    }
}
