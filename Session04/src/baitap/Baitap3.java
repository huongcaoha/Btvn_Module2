package baitap;

import Common.ReverseArr100000;
import Common.StopWatch;

public class Baitap3 {
    public static int[] reverse(int[] arr){
        int start = 0 ;
        int end = arr.length-1 ;
        while (start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp ;

            start++ ;
            end-- ;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i ;
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        reverse(arr);
        stopWatch.stop();
        System.out.println("Thời gian để thuật toán sắp xếp chạy xong là : " + stopWatch.getElapsedTime() + " milliseconds");

    }
}
