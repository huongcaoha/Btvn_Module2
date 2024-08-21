package bai6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 8, 8, 9, 7, 6, 2, 5, 15, 35, 789));
        System.out.println("Array root :");
        System.out.println(input);

        List<Integer> newArr = new ArrayList<>();
        for(Integer i : input){
            if(!newArr.contains(i)){
                newArr.add(i);
            }
        }

        System.out.println("New Array : ");
        System.out.println(newArr);
    }
}
