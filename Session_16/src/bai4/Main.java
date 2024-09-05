package bai4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr; /** Copyright belong to Rekkei Academy*/
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if(array[middle] == value){
                return middle;
            }
            if(value > array[middle]){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = getArr();
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
     Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int number = 0 ;
        while (true){
            try {
                System.out.println("Enter number want search : ");
                number = Integer.parseInt(scanner.nextLine().trim());
                if(number <= 0 || number >= 100){
                    System.err.println("Enter number  > 0 && number < 100 !");
                }else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Number invalid !");
            }
        }
        int  rs = binarySearch(arr,0,arr.length-1,number);
        if(rs == -1){
            System.out.println("Not found number " + number + " in array !");
        }else {
            System.out.println("Find number " + number + " in array at index " + rs );
        }
    }
}
