package bai5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Area of circle have radius 3.5 = " + StaticMethod.calCircleArea(3.5));
        System.out.println("Area of circle have radius 6 = " + StaticMethod.calCircleArea(6));

        System.out.println("Area of rectangle have width 2.5 & height 6 = " + StaticMethod.calRectangleArea(2.5,6));
        System.out.println("Area of rectangle have width 2.5 & height 6 = " + StaticMethod.calRectangleArea(4,7));

        System.out.println("Area of triangle have side1 : 3 , side2 : 4 ; side3 : 5 = " + StaticMethod.calTriangleArea(3,4,5));
        System.out.println("Area of triangle have side1 : 3 , side2 : 4 ; side3 : 5 = " + StaticMethod.calTriangleArea(4.5,7,6));



    }
}
