package bai8;

import bai1.Common;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number){
        if(number < 2){
            return false ;
        }
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0){
                return false ;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       int number = Common.getNumber("Enter number to check prime : ");
       boolean rs = isPrime(number);
       if(rs){
           System.out.println(number + " is prime !");
       }else {
           System.out.println(number + " not is prime !");
       }
    }
}
