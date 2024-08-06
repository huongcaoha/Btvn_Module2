package baitap;

import Common.QuadraticEquation;

public class Baitap2 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.inputData();
        if(quadraticEquation.getDiscriminant() >= 0){
            System.out.println("Root1 : " + quadraticEquation.getRoot1());
            System.out.println("Root2 : " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Root : " + quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
