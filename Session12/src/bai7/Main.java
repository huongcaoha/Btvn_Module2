package bai7;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "abc";
        Stack<Character> stack = new Stack<>();
        for(int i =  0 ; i < input.length() ; i++){
            stack.push(input.charAt(i));
        }
        Character tmp = stack.pop();
        boolean isCheck = true ;
        while (!stack.isEmpty()){
            if(tmp.compareTo(stack.pop()) < 0){
              isCheck = false;
              break;
            }
        }
        if(isCheck){
            System.out.println("Chuỗi trên là chuỗi giảm dần !");
        }else {
            System.out.println("Chuỗi trên ko phải chuỗi giảm dần !");
        }
    }
}
