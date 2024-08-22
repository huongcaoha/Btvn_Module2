package bai9;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int number = 123;
        Stack<Integer> rs = new Stack<>();
        while (number > 0){
            int tmp = number % 2 ;
            rs.push(tmp );
            number /= 2 ;
        }
        System.out.println(number + " converse binary : " );
        System.out.print(0);
        while (!rs.isEmpty()){
            System.out.print(rs.pop());
        }
    }
}
