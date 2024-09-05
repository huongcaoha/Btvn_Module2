package bai8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input  :");
        String input = scanner.nextLine().trim();
        String[] arr = input.split("");
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    String tmp = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = tmp ;
                }
            }
        }
        System.out.println("After sort : " + Arrays.toString(arr));
        System.out.println("Độ phức tạp của bài toán là O(n^2)");
    }
}
