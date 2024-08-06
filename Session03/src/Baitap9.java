public class Baitap9 {
    public static void main(String[] args) {
        int[] arr = {5,6,2,4,8,10,46,96,3};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;                                                                                                                                                                                   ;

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max1){
                max2 = max1 ;
                max1 = arr[i];

            }
        }
        System.out.println("Max 1 : " + max1);
        System.out.println("Max 2 : " + max2);
    }
}
