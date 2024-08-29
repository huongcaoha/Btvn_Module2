package bai12;

import bai1.Common;

public class Main {

    public static int findCommonDivisor(int a , int b ){
        if(a == 0 && b == 0){
            return -1;
        }else if(a == 0){
            return b ;
        }else if (b == 0){
            return a ;
        }

        while (b != 0){
            int tmp = b ;
            b = a % b ;
            a = tmp ;
        }
        return  a ;
    }
    public static void main(String[] args) {
            int a  =Common.getNumber("Enter number a : ");
            int b = Common.getNumber("Enter number b : ");
            int rs = findCommonDivisor(a,b);
            if(rs == -1){
                System.err.println("Error ! a = 0 & b = 0 ");
            }else {
                System.out.println("Divisor greatest common of " + a + " and " + b + " = " + rs);
            }
    }
}
