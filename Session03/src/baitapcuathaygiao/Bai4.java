package baitapcuathaygiao;

import baitaplearn.Common;

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
        int arr[] = {112,5678,65,14,68,6,4,9};

        System.out.println("Before sort : ");
        for(int number : arr){
            System.out.print(number + "\t");
        }
        arr = Common.sortInt(arr);

        System.out.println("After sort :" + Arrays.toString(arr));




    }
}
