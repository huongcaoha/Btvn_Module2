package bai2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String input : ");
        String input = "({[]})";
        boolean ischeck = true;
        for(int i = 0 ; i < input.length() ; i++){
            char current = input.charAt(i);
            if(current == '(' || current  == '{' || current == '['){
                    characters.push(input.charAt(i));
            }else if(current == ')' || current == '}' || current == ']'){
                char head = characters.pop();
                 if (current == ')' && head != '(' || current == '}' && head != '{' || current == ']' && head != '['){
                    ischeck = false;
                    break;
                }
            }
        }
        if(!characters.isEmpty()){
            ischeck = false;
        }
        if(ischeck){
            System.out.println("Chuỗi hợp lệ !");
        }else {
            System.out.println("Chuỗi không đủ dấu đóng mở !");
        }

    }
}
