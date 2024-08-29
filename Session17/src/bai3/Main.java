package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1","huong","35","456","cao","ha"));
        int sum = 0 ;
        for(String s : list){
            try {
                sum += Integer.parseInt(s);
            }catch (NumberFormatException n){
                System.err.println(s + " is not number !");
            }
        }
        System.out.println("Sum integer in list : " + sum);

    }
}
