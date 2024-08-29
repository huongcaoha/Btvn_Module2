package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> mergeSort(List<Integer> list){
        int indexMid = list.size() / 2 ;
        List<Integer> left = list.subList(0,indexMid);
        List<Integer> right = list.subList(indexMid,list.size());
        List<Integer> rs = new ArrayList<>();
        int l = 0 ;
        int r = 0 ;
        while (l < left.size() && r < right.size()){
            if(left.get(l) <= right.get(r)){
                rs.add(left.get(l));
                l++ ;
            }else {
                rs.add(right.get(r));
                r++ ;
            }
        }

        while (l < left.size()){
            rs.add(left.get(l));
            l++ ;
        }

        while (r < right.size()){
            rs.add(right.get(r));
            r++;
        }
        return  rs ;
    }

    public static int searchBinary(List<Integer> list , int first , int last , int value){
        if(first > last){
            return  -1 ;
        }
        int mid = (first + last) / 2 ;
        if(list.get(mid) == value){
            return  mid ;
        }else if (value > list.get(mid)) {
            return searchBinary(list,mid+1,last,value);
        }else {
            return searchBinary(list,first,mid-1,value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.asList(1,5,8,97,56,12,34,48,3,9);
        input = mergeSort(input);
        System.out.println(input);
        int number = 0 ;
       while (true){
           try {
               System.out.println("Enter number to find in list : ");
               number = Integer.parseInt(scanner.nextLine().trim());
               break;
           }catch (NumberFormatException e){
               System.err.println("Number invalid !");
           }
       }
       int rs = searchBinary(input,0,input.size()-1,number);
       if(rs == -1){
           System.err.println("Not found " + number + " in array !");
       }else {
           System.out.println("Find number " + number + " in array at index " + rs );
       }
    }
}
