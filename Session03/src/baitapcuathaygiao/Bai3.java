package baitapcuathaygiao;

import baitaplearn.Common;

public class Bai3 {
    public static void main(String[] args) {
        //Nhập vào mảng có n phần tử kiểu số thực
        //Hiển thị mảng vừa nhập
        //Sắp xếp các phần tử tăng dần và hiển thị
        System.out.println("Enter n element in arr");
        int n = 0 ;
        n = Common.getInputInt(n);
        float[] arr = new float[n];
        for(int i = 0 ; i < n ; i++){

            System.out.println("Enter value index " + (i+1));
            arr[i] = Common.getInputFloat(arr[i]);
        }

        System.out.println("Array after insert :");
        for(float number : arr){
            System.out.print(number + "\t");
        }

        System.out.println("Array after sort :");

        for(int i = 0 ; i < arr.length-1 ;){
            if(arr[i] > arr[i+1]){
                float tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp ;
                if(i > 0){
                    i-- ;
                }
            }else {
                i++ ;
            }
        }

        for(float number : arr){
            System.out.print(number + "\t");
        }
    }
}
