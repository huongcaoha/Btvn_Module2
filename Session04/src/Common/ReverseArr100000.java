package Common;

public class ReverseArr100000 {
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
}
