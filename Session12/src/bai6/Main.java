package bai6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,56,8,4,6,3,15,6));
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0 ; i < arr.size() ; i++){
            if(deque.isEmpty()){
                deque.add(arr.get(i));
            }else if(arr.get(i) < deque.getFirst()){
                deque.addFirst(arr.get(i));
            }else {
                deque.addLast(arr.get(i));
            }
        }
        System.out.println("Min number : " + deque.getFirst());
    }
}
