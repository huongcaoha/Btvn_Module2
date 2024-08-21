package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "Rikkei Academy để nông dân biết code";
        List<String> arr = new ArrayList<>(Arrays.asList(input.split(" ")));

        System.out.println("Mảng sau khi chọn những phần tử có độ dài ký tự > 3 : ");
        for(String a : arr){
            if(a.length() >= 3){
                System.out.print(a + "\t");
            }
        }
    }
}
