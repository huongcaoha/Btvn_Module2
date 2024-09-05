package bai9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    private  static int searchBinary(Integer[] arr , int left, int right ,int value){
        if(left > right){
            return -1 ;
        }
        int mid = (left + right) / 2 ;
        if(arr[mid] == value){
            return mid ;
        }else if (value > arr[mid]){
          return   searchBinary(arr,mid+1,right,value);
        }else if (value < arr[mid]){
            return  searchBinary(arr,left, mid-1,value);
        }
        return -1 ;
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
        int rs = searchBinary(arr,0,arr.length-1,number);
        if(rs == -1){
            System.out.println("Not found number in array !");
        }else {
            System.out.println("Find number in array at index : " + rs );
        }
    }
}
