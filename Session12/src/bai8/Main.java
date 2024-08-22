package bai8;

import java.util.Stack;

public class Main {
    public static boolean checkPrime(int number){
        if(number < 2){
            return false;
        } else {
            for(int i = 2 ; i < number ; i++){
                if(number % i == 0){
                    return false ;
                }
            }
            return true ;
        }
    }
    public static void main(String[] args) {
        String input = "hioklasdlsadfsdf1afd46adsfas31f56sd4f";
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < input.length() ;i++){
            if(Character.isDigit(input.charAt(i))){
                stack.push(Character.getNumericValue(input.charAt(i)));
            }
        }
        System.out.println("The prime numbers in the above string are :");
        while (!stack.isEmpty()){
            Integer value = stack.pop();
            if(checkPrime(value)){
                System.out.println(value);
            }
        }
    }
}
