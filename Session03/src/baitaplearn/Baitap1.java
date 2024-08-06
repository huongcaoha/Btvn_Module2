package baitaplearn;

import java.util.Arrays;

public class Baitap1 {
    public static void main(String[] args) {
        int[] arrInt = {1,2,3,4,5,6,7,8,9};
        System.out.println("Mảng trước khi xóa ");
        for(int number : arrInt){
            System.out.print(number + " ");
        }
        int input = 0;
        System.out.println("Enter number need delete : ");
        input = Common.getInputInt(input);
        int index = -1 ;
        for(int i  = 0 ; i < arrInt.length-1 ; i++){
            if(arrInt[i] == input){
                index = i ;
            }
            if(index >= 0 ){
                arrInt[i] = arrInt[i+1];
            }
        }

        if(index >= 0){
            System.out.println("Mảng sau khi xóa :");
            for(int  i = 0 ; i < arrInt.length - 1  ; i++){
                System.out.print(arrInt[i] + " ");
            }
        }else {
            System.out.println( "Không tìm thấy number "+input + " trong mảng !" );
        }
    }
}
