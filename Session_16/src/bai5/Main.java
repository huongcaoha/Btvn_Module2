package bai5;

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
    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        int min = 0 ;
        while (true){
            try {
                System.out.println("Enter number min  want search : ");
                min = Integer.parseInt(scanner.nextLine().trim());
                if(min <= 0 || min >= 100){
                    System.err.println("Enter number min > 0 && number < 100 !");
                }else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Number invalid !");
            }
        }

        int max = 0 ;
        while (true){
            try {
                System.out.println("Enter number max  want search : ");
                max = Integer.parseInt(scanner.nextLine().trim());
                if(max >= 100 && max < min){
                    System.err.println("Enter number  > or number < 100  && max > min!");
                }else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Number invalid !");
            }
        }

        int nextMin = -1 ;
        int nextMax = -1 ;

        for(int  i = 0 ; i < arr.length ; i++){
            if(arr[i] > min && arr[i] < max && arr[i] > nextMax){
                nextMin = nextMax;
                nextMax = arr[i];
            }
        }

        for(int  i = 0 ; i < arr.length ; i++){
            if(arr[i] > min && arr[i] < max && arr[i] < nextMin){
                nextMin = arr[i];
            }
        }
        if(nextMax != -1 && nextMin == -1){
            System.out.println("Number next min "+ min + " and number next max " + max + " is : " + nextMax);
        } else if (nextMax != -1 && nextMin != -1 ) {
            System.out.println("Number next min " + min + " is : " + nextMin);
            System.out.println("Number next max " + max + " is : " + nextMax);
        }else {
            System.out.println("Not found number next min " + min + " and number next max " + max);
        }
    }

}
