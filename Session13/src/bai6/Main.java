package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i <= 10 ; i++){
            arr.add(random.nextInt(100));
        }
        TreeMap treeMap = new TreeMap();
        treeMap.buildTreeFromArray(arr);

        treeMap.postorder(treeMap.getRoot());
        System.out.println();
        System.out.println("*********************************");
        treeMap.inorderTraversal(treeMap.getRoot());
    }
}
