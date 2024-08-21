package bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        List<Integer> numbers = new ArrayList<>();
//        for(int i = 1 ; i <= 10 ; i++){
//            numbers.add(random.nextInt(100));
//        }
//        System.out.println(numbers);
//        int numberMax = Collections.max(numbers);
//        System.out.println("Number max : " + numberMax);
//
//        Collections.reverse(numbers);
//        System.out.println("Mảng sau khi đảo ngược là : ");
//        System.out.println(numbers);
//
//        Collections.sort(numbers);
//        System.out.println("Mảng sau khi sắp xếp là :");
//        System.out.println(numbers);
//
//        List<Integer> numbers2 = new ArrayList<>();
//        for(int i = 1 ; i <= 10 ; i++){
//            numbers2.add(random.nextInt(100));
//        }
//        System.out.println("Mảng number2 :");
//        System.out.println(numbers2);
//
//        numbers.addAll(numbers2);
//        System.out.println("Mảng numbers sau khi add all mảng number2 :  ");
//        System.out.println(numbers);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(7,7,2,3,4,5,6,8,9));
        for(int i = 0 ; i < numbers.size() ; i++){
            if(numbers.get(i) == 7){
                numbers.remove(i);
                i-= 1 ;
            }
        }
        System.out.println(numbers);
    }
}
