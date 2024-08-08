package baitap3;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email :");
        String email = scanner.nextLine();
        if(email.matches("^[a-zA-Z][a-zA-Z0-9]{7,}@[a-z]{3,}.[a-z]{2,}$")){
            System.out.println(email + " là hợp lệ !");
        }else {
            System.out.println(email + " không phải là 1 email !");
        }
    }
}
