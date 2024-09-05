package bai1;

import java.util.Arrays;

public class Main {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr; /** Copyright belong to Rekkei Academy*/
    }
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Number max in array : " + max);
    }
}
