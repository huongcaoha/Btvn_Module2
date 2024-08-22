package bai3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "huong gnouh";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        for(int i = 0 ; i < input.length() ;i++){
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }
        boolean isCheck = true ;
        for(int i = 0 ; i < input.length() ; i++){
            Character pop = stack.pop();
            Character poll = queue.poll();
            if(pop != poll){
                isCheck = false;
                break;
            }
        }
        if(isCheck){
            System.out.println(input + " is string Palindrome !");
        }else {
            System.out.println(input + " is not string Palindrome !");
        }
    }
}
