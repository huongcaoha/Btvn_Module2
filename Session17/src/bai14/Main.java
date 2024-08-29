package bai14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr1= Arrays.asList(1,56,7,95,2,5,6,7);
        List<Integer>arr2 = new ArrayList<>();
        int random = (int) (Math.random()*100);
        List<Integer> output = new ArrayList<>();
        if(random % 2 == 1){
            output = arr1 ;
        }else {
            output = arr2 ;
        }

        if(output.isEmpty()){
            System.err.println("List number is empty !");
        }else {
            double avg = (double) output.stream().reduce(0, Integer::sum) / output.size() ;
            System.out.println("Average of list = " + avg );
        }
    }
}
