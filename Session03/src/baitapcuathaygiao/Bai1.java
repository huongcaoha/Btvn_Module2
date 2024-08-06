package baitapcuathaygiao;

import baitaplearn.Common;

public class Bai1 {
    //Nhập vào mảng có n phần tử kiểu số thực
    //Hiển thị các phần tử của mảng ra màn hình.
    public static void main(String[] args) {
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
    }
}
