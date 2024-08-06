package baitapcuathaygiao;

import java.util.Arrays;
import java.util.Random;

public class Bai7 {
    public static void main(String[] args) {
//        Nhập vào ma trận vuông có n dòng.
//Hiển thị mảng vừa nhập
//Hiển thị đường biên của mảng
//Hiển thị đường chéo chính
//HIển thị đường chéo phụ

        int n = 10 ;
        Random random = new Random();
        int[][] matric = new int[n][n] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                matric[i][j] = random.nextInt(10);
            }
        }

        for(int[] arr : matric){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 || j == 0 || i == (n-1) || j == (n-1)){
                    System.out.print(matric[i][j] + "  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == j || j == (n-1-i)){
                    System.out.print(matric[i][j] + "  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
