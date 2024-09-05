package bai3;

import org.w3c.dom.Node;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(1,456);
        hashmap.put(2,123);
        hashmap.put(3,789);
        hashmap.put(4,147);
        hashmap.put(5,258);
        hashmap.put(6,369);
        hashmap.put(7,159);
        hashmap.put(8,357);
        hashmap.put(9,999);
        List<Map.Entry<Integer,Integer>> rs = new ArrayList<>(hashmap.entrySet());
        rs.sort(Comparator.comparingInt(Map.Entry::getValue));
        for(Map.Entry<Integer,Integer> el : rs){
            System.out.print(el.getValue() + " ");
        }

    }
}
