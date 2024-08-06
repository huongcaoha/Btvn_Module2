package baitaplearn;

import java.util.Scanner;

public class Common {
   static Scanner scanner = new Scanner(System.in);
    public static int getInputInt(int number){
       do {
           System.out.println("Enter number : ");
           try {
               number = Integer.parseInt(scanner.nextLine());
               break;
           }catch (Exception e){
               System.out.println("Enter valid integer !");
           }
       }while (true);
       return  number ;
    }
    public static float getInputFloat(float number){
        do {
            System.out.println("Enter number : ");
            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Enter valid number !");
            }
        }while (true);
        return  number ;
    }

    public static int[] upSizeArr(int[] arr ,int valuePlus){
        int tmp[] = new int[arr.length+1];
        for(int i = 0 ; i < arr.length ;i++){
            tmp[i] = arr[i];
        }
        arr = tmp ;
        arr[arr.length-1] = valuePlus ;
        return arr ;
    }
    public static int[] sortInt(int[] arr){
        int piot = arr[0];
        int arrFirst[] = new int[0];
        int arrMid[] = new int[0];
        int arrLast[] = new int[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > piot){
//               upSizeArr(arrLast,arr[i]);
                int tmp[] = new int[arrLast.length+1];
                for(int j = 0 ; j < arrLast.length ;j++){
                    tmp[j] = arrLast[j];
                }
                arrLast = tmp ;
                arrLast[arrLast.length-1] = arr[i] ;
            }else if(arr[i] < piot){
//                upSizeArr(arrFirst,arr[i]);
                int tmp[] = new int[arrFirst.length+1];
                for(int j = 0 ; j < arrFirst.length ;j++){
                    tmp[j] = arrFirst[j];
                }
                arrFirst = tmp ;
                arrFirst[arrFirst.length-1] = arr[i] ;
            }else {
//                upSizeArr(arrMid,arr[i]);
                int tmp[] = new int[arrMid.length+1];
                for(int j = 0 ; j < arrMid.length ;j++){
                    tmp[j] = arrMid[j];
                }
                arrMid = tmp ;
                arrMid[arrMid.length-1] = arr[i] ;
            }
        }

        if(arrFirst.length > 2){
           arrFirst = sortInt(arrFirst);
        }else {
            if(arrFirst.length == 2) {
                if (arrFirst[0] > arrFirst[1]) {
                    int tmp = arrFirst[0];
                    arrFirst[0] = arrFirst[1];
                    arrFirst[1] = tmp;
                }
            }
        }

        if(arrLast.length > 2){
          arrLast =  sortInt(arrLast);
        }else {
            if(arrLast.length == 2){
                if(arrLast[0] > arrLast[1]){
                    int tmp = arrLast[0];
                    arrLast[0] = arrLast[1];
                    arrLast[1] = tmp ;
                }
            }
        }

        int rs[] = new int[arrFirst.length + arrMid.length + arrLast.length];
        if(arrFirst.length > 0 ){
            for(int i = 0 ; i < arrFirst.length ; i++){
                rs[i] = arrFirst[i];
            }
        }

        if(arrMid.length > 0){
            for(int i = 0 ; i < arrMid.length ; i++){
                rs[i+arrFirst.length] = arrMid[i];
            }
        }

        if(arrLast.length > 0){
            for(int i = 0 ; i < arrLast.length ; i++){
                rs[i+arrFirst.length+arrMid.length] = arrLast[i];
            }
        }
        return rs ;
    }
}
