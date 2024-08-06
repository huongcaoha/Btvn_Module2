package baitaplearn;

public class Baitap3 {
    public static void main(String[] args) {
        System.out.println("Enter length of array 1 ");
        int lengthArr1 = 0;
        lengthArr1 = Common.getInputInt(lengthArr1);
        int[] arr1 = new int[lengthArr1];
        for (int i = 0 ; i < lengthArr1 ; i++){
            System.out.println("Enter value index "+ i + " of arr1 ");
                arr1[i] = Common.getInputInt(arr1[i]);
        }

        System.out.println("Enter length of array 2 ");
        int lengthArr2 = 0;
        lengthArr2 = Common.getInputInt(lengthArr2);
        int[] arr2 = new int[lengthArr2];
        for (int i = 0 ; i < lengthArr2 ; i++){
            System.out.println("Enter value index "+ i + " of arr2 ");
            arr2[i] = Common.getInputInt(arr2[i]);
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0 ; i < arr1.length ; i++){
            arr3[i] = arr1[i] ;
        }

        for(int i = 0 ; i < arr2.length ; i++){
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println("Arr3 after concat is :");
        for(int num : arr3){
            System.out.print(num + " ");
        }
    }
}
