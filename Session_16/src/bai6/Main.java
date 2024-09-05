package bai6;

import java.util.Arrays;

public class Main {
    public static void insertionSort(int[] arr){
        for(int i = 1 ; i < arr.length ;i++ ){
            int key = arr[i];
            int  j = i - 1 ;
            while (j >= 0 && arr[j] > key){
                arr[j+1] =arr[j] ;
                j-- ;
            }
            arr[j+1] = key ;
            System.out.println("Bước "+ i + " mảng sẽ ra kết quả là : " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,9,6,86,23,456,47};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);


    }
}
