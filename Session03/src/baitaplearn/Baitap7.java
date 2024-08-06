package baitaplearn;

public class Baitap7 {
    public static void main(String[] args) {
        System.out.println("Enter number column and row in arr ");
        int size = 0 ;
        size = Common.getInputInt(size);
        int[][] arr = new int[size][size];
        int numberMax = Integer.MIN_VALUE ;
        for(int i  = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                System.out.println("Enter value of row " + i + " column " + j);
                arr[i][j] = Common.getInputInt(arr[i][j]);
            }
        }

        System.out.println("Array after insert is :");
        for(int[] number : arr){
            for(int num : number){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int sum1 = 0 ;
        int sum2 = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum1 += arr[i][i];
        }

        for(int i = 0 ; i < arr.length ; i++){
                   sum2 += arr[i][arr.length-1-i];
                   System.out.print(arr[i][arr.length-1-i] + " ");
        }

        System.out.println("Tổng của đường chéo 1 : " + sum1);
        System.out.println("Tổng của đuờng chéo 2 : " + sum2);

    }
}
