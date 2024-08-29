package bai13;

import bai1.Common;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter input  : ");
        String input = Common.scanner.nextLine().trim();
        if(input.isEmpty() || input == null){
            System.err.println("Cannot reverse empty !");
        }else {
            String[]arr = input.split("");
            List<String> rs = Arrays.asList(arr);
            System.out.println(rs.reversed().toString());
        }
    }
}
