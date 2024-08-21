package bai3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "Lỗi Cannot resolve method 'print(String, Integer, String, String, String)' xảy ra bởi vì phương thức System.out.print() không hỗ trợ nhiều đối số như vậy. Thay vào đó, bạn nên sử dụng phương thức System.out.printf() để định dạng chuỗi kết quả.";
        List<String> arr = new ArrayList<>(Arrays.asList(input.split(" ")));
        System.out.println("Mảng gốc là :");
        System.out.println(arr);
        List<String> newArr = new ArrayList<>();
        arr.sort(Comparator.comparingInt(String::length));
        int minLength = arr.get(0).length();
        for(String s : arr){
            if(s.length() == minLength){
                newArr.add(s);
            }
        }
        System.out.println("Những phần tử có độ dài ngắn nhất là :");
        System.out.println(newArr);

    }
}
