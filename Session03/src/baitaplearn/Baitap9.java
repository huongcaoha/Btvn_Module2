package baitaplearn;

public class Baitap9 {
    public static void main(String[] args) {
        int[] arr = {-1,-1,-2,-3,-4,-5};
//        int[] arr = {5,6,10,8,12,48,96,96};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

//        for(int i = 1 ; i < arr.length ; i++){
//            if(arr[i] > max1){
//                max2 = max1 ;
//                max1 = arr[i];
//
//            }
//        };
//        if (arr[0] > arr[1]){
//            max1 = arr[0];
//            max2 = arr[1];
//        }else{
//            max1 = arr[1];
//            max2 = arr[0];
//        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if (arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }
        System.out.println("Max 1 : " + max1);
        System.out.println("Max 2 : " + max2);
    }
}
