package bai2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = getArr();
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        boolean check = false ;
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
        Map<Integer,Integer> rs = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == number){
                    rs.put(i,j);
                    check = true ;
                }
            }
        }
        if(check){
            System.out.println("The positions of numbers found in the array are :");
            for(Map.Entry<Integer,Integer> entry : rs.entrySet()){
                System.out.println("Arr["+entry.getKey()+"]["+entry.getValue()+"]");
            }
        }else {
            System.err.println("Not found number in array !");
        }
    }
}
