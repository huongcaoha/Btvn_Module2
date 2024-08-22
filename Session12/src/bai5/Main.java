package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5,36,8,456,8,5));
        Stack<Integer> stack = new Stack<>();
        for(Integer i : arr){
            if(stack.isEmpty()){
                stack.push(i);
            }else if(stack. peek() < i){
                stack.push(i);
            }
        }
        System.out.println("Number max in list : " + stack.peek());
    }
}
