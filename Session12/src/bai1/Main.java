package bai1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> input = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int number = 0 ;
       while (true){
          try {
              System.out.println("Enter number character want add :");
              number = Integer.parseInt(scanner.nextLine().trim());
              if(number > 0){
                  break;
              }else {
                  System.err.println("Enter number > 0 !");
              }
          }catch (Exception e){
              System.err.println("number invalid !");
          }
       }
       for(int i = 1 ; i <= number ; i++){
           System.out.println("Enter String number " + i);
           String c = scanner.nextLine();
           input.push(c);
       }
        System.out.println("Array after reverse : ");
       while (!input.empty()){
           System.out.println(input.pop());
       }
    }
}
