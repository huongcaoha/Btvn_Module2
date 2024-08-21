package bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(3,5,8,9,7,6,2,5,15,35,789));
        System.out.println("Array before sort : ");
        System.out.println(input);

        for(int i = 0 ; i < input.size()-1 ; ){
            if(input.get(i) > input.get(i+1)){
                int tmp = input.get(i);
                input.set(i,input.get(i+1));
                input.set(i+1 ,tmp);
                if(i > 0){
                    i-- ;
                }
            }else {
                i++ ;
            }
        }
        System.out.println("Array after sort :");
        System.out.println(input);
    }
}
