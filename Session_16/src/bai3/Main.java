package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr; /** Copyright belong to Rekkei Academy*/
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
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
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == number){
                System.out.println("Find the number "+ number + " in the "+i+" position");
                return;
            }
        }
        System.out.println("Not found number " + number + " in array !");
    }
}
