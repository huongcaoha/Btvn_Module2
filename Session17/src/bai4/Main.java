package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input : ");
        String input = scanner.nextLine().trim();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0 ; i < input.length() ; i++){
           try {
               int number = Integer.parseInt(String.valueOf(input.charAt(i)));
               numbers.add(number);
           }catch (NumberFormatException n){
               System.err.println("Has character not integer converse replace = 0 !");
               numbers.add(0);
           }
        }
        System.out.println("After converse String to list :");
        for(Integer i : numbers){
            System.out.print(i + "\t");
        }
    }
}
