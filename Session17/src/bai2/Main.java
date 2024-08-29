package bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        if(list.isEmpty()){
            System.err.println("List empty !");
        }else {
            int sum = 0 ;
            for(Integer i : list){
                sum += i ;
            }
            System.out.println("Sum of list : " + sum);
        }
    }
}
