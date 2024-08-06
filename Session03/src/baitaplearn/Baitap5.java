package baitaplearn;

public class Baitap5 {
    public static void main(String[] args) {
        System.out.println("Enter size of arr ");
        int size = 0 ;
        size = Common.getInputInt(size);
        int[] arr = new int[size];
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < size ; i++){
            System.out.println("Enter value index " + i );
            arr[i] = Common.getInputInt(arr[i]);
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Arr : ");
        for(int number : arr){
            System.out.println(number + " ");
        }
        System.out.print("Number min : " + min);

    }
}
