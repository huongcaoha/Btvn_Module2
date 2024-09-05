import bai6.TreeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        bai6.TreeMap treeMap = new TreeMap();
       List<Integer> arr = new ArrayList<>(Arrays.asList(1,5,67,89,6,4,2,79,16));
        treeMap.buildTreeFromArray(arr);
        treeMap.inorderTraversal(treeMap.getRoot());
    }
}
