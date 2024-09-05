package bai12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static int searchBinary(Integer[] arr ,int first , int last ,int value){
        int mid = (first + last) / 2 ;
        if(first > last){
            return -1 ;
        }
        if(value == arr[mid]){
            return  mid ;
        }else if(value < arr[mid]){
            return searchBinary(arr,mid+1,last,value);
        }else {
            return searchBinary(arr,first,mid-1,value);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        int number = 0 ;
        while (true){
            try {
                System.out.println("Enter number want search : ");
                number = Integer.parseInt(scanner.nextLine().trim());
                break;
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }
        int index = searchBinary(arr,0,arr.length-1,number);
        if(index == -1 ){
            System.out.println("Not found number in array !");
        }else {
            System.out.println("Find number in array at index : " + index);
        }
    }
}
