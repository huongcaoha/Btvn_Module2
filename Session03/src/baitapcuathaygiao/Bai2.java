package baitapcuathaygiao;

import baitaplearn.Common;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Nhập vào họ tên của n bạn sinh viên trong 1 lớp
        //Hiển thị họ tên của tất cả các bạn sinh viên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n element in arr ");
        int n = 0 ;
        n = Common.getInputInt(n);
        String students[] = new String[n] ;
        for(int i = 0 ; i < n  ; i++){
            System.out.println("Enter full name student index " + (i+1));
            students[i] = scanner.nextLine();
        }

        for(String student : students){
            System.out.println(student);
        }
    }
}
