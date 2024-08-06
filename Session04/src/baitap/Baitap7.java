package baitap;

import Common.Circle1;

public class Baitap7 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(5);
        System.out.println("Radius : " + circle.getRadius());
        System.out.println("Area : " + circle.getArea());

        // khi gọi phương thức của class Circle1 với access modifier là public thì chạy bt
        // còn khi gọi phương thức của class Circle1 với access modifier là private thì bị lỗi do ko thể truy cập vào phương thức có access modifier là private
    }
}
