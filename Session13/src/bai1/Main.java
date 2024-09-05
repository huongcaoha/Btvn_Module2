package bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Arrays.asList("Huong","Ngoc","Hung","Yen","Linh","Huong"));
        Map<String,Integer> rs = new HashMap<>();
        for(String s : input){
            if(rs.containsKey(s)){
                rs.put(s,rs.get(s)+1);
            }else {
                rs.put(s,1);
            }
        }
        System.out.println("Số lượng từ của mỗi phần tử xuất hiện trong mảng là :");
        for(Map.Entry<String,Integer> ojb : rs.entrySet()){
            System.out.println(ojb.getKey() + " : " + ojb.getValue());
        }
    }
}
