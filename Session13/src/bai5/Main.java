package bai5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i <= 10 ; i++){
            arr.add(random.nextInt(100));
        }

        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for(int i = 0 ; i < arr.size() ; i++){
            treeMap.put(arr.get(i),0);
        }

        for(Map.Entry<Integer,Integer> ojb : treeMap.entrySet()){
            System.out.println(ojb.getKey() + " : " + ojb.getValue());
        }
        System.out.println("Element min value : " + treeMap.firstKey());

        TreeMap<Integer,Integer> treeMap2 = new TreeMap<>(Comparator.reverseOrder());
        treeMap2.putAll(treeMap);
        treeMap2.remove(treeMap2.firstKey());

        System.out.println("Element next max value : " + treeMap2.firstKey());

    }
}
