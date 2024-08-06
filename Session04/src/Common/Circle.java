package Common;

import java.util.Scanner;

public class Circle {
    private static float radius ;
    private String color ;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float primeter(){
        return (float) (2*Math.PI*radius);
    }

    public float area(){
        return (float) (Math.PI*(Math.pow(radius,2)));
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter radius :");
                radius = Float.parseFloat(scanner.nextLine());
                if(radius > 0){
                    break ;
                }
            }catch (Exception e){
                System.out.println("Enter radius valid float and > 0");
            }
        }

        System.out.println("Enter color :");
        color = scanner.nextLine();

    }

    public void displayData(){
        System.out.println("Radius : " + radius);
        System.out.println("Colo : " + color);
    }
}
