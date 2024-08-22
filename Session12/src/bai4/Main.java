package bai4;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        Stack<Character> stack = new Stack<>();
        boolean isCheck = true ;
        for(int i = 0 ; i < input.length() ;i++){
            char c = input.charAt(i);
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                char pop = stack.pop();
                if(pop != '('){
                    isCheck = false ;
                    break;
                }
            }
        }
        if(!stack.isEmpty()){
            isCheck = false;
        }

        if(isCheck){
            System.out.println("Valid expression !");
        }else {
            System.out.println("Invalid expression !");
        }
    }
}
