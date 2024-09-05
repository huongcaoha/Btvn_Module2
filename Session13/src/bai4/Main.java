package bai4;

import java.util.HashMap;
import java.util.Map;

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

        Map<Integer,Integer> hashmapFake = new HashMap<>();
        hashmapFake.putAll(hashmap);

        for(Map.Entry<Integer,Integer> el : hashmapFake.entrySet()){
            System.out.println(el.getKey() + " : " + el.getValue());
        }

        System.out.println("159 exis in hashmapFake :  " + hashmapFake.containsValue(159));
        System.out.println("888 exis in hashmapFake :  " + hashmapFake.containsValue(888));

    }
}
