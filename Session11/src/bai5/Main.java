package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 8,8, 9, 7, 6, 2, 5, 15, 35, 789));
        System.out.println("Array root :");
        System.out.println(input);

        for(int i = 0 ; i < input.size() ; i++){
            if(input.get(i) % 2 == 0){
                input.remove(i);
                i-- ;
            }
        }
        System.out.println("Array after remove even number :");
        System.out.println(input);
    }
}
