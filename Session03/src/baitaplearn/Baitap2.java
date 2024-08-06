package baitaplearn;

public class Baitap2 {
    public static void main(String[] args) {
        int[] arrInt = {1,2,3,4,5,6,7,8,9};
        System.out.println("Mảng trước khi thêm : ");
        for(int num : arrInt){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Enter number need insert in arr ");
        int number = 0 ;
        number = Common.getInputInt(number);
        boolean tmp = false ;
        System.out.println("Enter index need insert in array ");
        int index = 0 ;
        index = Common.getInputInt(index);
        int[] newArr = new int[arrInt.length+1];
        if(index < 0 || index > newArr.length-1){
            System.out.println("Không chèn đc phần tử vào mảng");
        }else {
            if(index == newArr.length -1){
                for (int i = 0 ; i < arrInt.length ; i++){
                    newArr[i] = arrInt[i];
                }
                newArr[newArr.length-1] = number ;
            }else {
                for(int i = 0 ; i < newArr.length-1 ; i++){
                    if(index == i){
                        tmp = true ;
                        newArr[index] = number ;
                        newArr[i+1] = arrInt[i];
                        continue;
                    }
                    if(tmp){
                        newArr[i+1] = arrInt[i];
                    }else {
                        newArr[i] = arrInt[i];
                    }
                }
            }

            System.out.println("Mảng sau khi chèn là : ");
            for(int num : newArr){
                System.out.print(num + " ");
            }
        }
    }
}
