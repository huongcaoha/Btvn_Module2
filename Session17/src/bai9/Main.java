package bai9;

import bai1.Common;

import java.util.List;

public class Main {
    public static int searchFibonacci(int index){
        int count = 2 ;
        int first = 0 ;
        int next = 1 ;
        if(index == 0 ||  index == 1){
            return 0 ;
        }else if (index == 2) {
            return  1 ;
        }
        while (index != count){
            int tmp = next ;
            next = first + next ;
            first = tmp ;
            count++;
        }
        return next;
    }
    public static void main(String[] args) {
        int index = Common.getNumber("Enter index to find fibonacci : ");
        if(index <= 0){
            System.out.println("Not found !");
            return;
        }
        int rs = searchFibonacci(index);
        System.out.println("Number fibonacci at index " + index + " = " + rs);
    }
}
