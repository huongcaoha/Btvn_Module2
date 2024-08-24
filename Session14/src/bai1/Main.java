package bai1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,5,6,3,8,9,456,2));
        System.out.println("Array initial :");
        for(Integer i : arr){
            System.out.print(i + " ");
        }
       Optional<Integer> max = arr.stream().max(Integer::compareTo);
        System.out.println("Number max : " + max.get());

        System.out.println("Array even :");
        List<Integer> evens = arr.stream().filter(el -> el % 2 == 0 ).collect(Collectors.toList());
        for(Integer i : evens){
            System.out.print(i + " ");
        }
        System.out.println();
        int number1 ;
       while (true){
          try {
              System.out.println("Enter number to get number > number in array :");
              number1 = Integer.parseInt(scanner.nextLine().trim());
              break;
          }catch (Exception e){
              System.err.println("Number invalid !");
          }
       }
       final  int numberFinal = number1;
       List<Integer> arrThanNumber = arr.stream().filter(el -> el > numberFinal).collect(Collectors.toList());
        System.out.println("Array number > " + numberFinal);
        for(Integer i : arrThanNumber){
            System.out.print(i + " ");
        }


        int sumArr = arr.stream().reduce(0,(pre,current) -> pre + current);
        System.out.println("Sum : " + sumArr);

        boolean checkNumberEvent = arr.stream().anyMatch(number -> number % 2 == 0);
        System.out.println("Mảng trên có chứa số chẵn : " + checkNumberEvent);

        IntStream intStream = IntStream.range(1,11);
        System.out.println("Array from 1 - 10 : ");
        intStream.forEach(System.out::println);

        System.out.println("Original array !");
        List<String> listName = new ArrayList<>(Arrays.asList("Hưởng","Tùng","Hùng","Anh","My"));
        listName.forEach(System.out::println);
        System.out.println("_____________________________________________");

        List<String> listName2= listName.stream().sorted().collect(Collectors.toList());
        System.out.println("Array after sort a-> z :");
        listName2.forEach(System.out::println);

        System.out.println("Array after converse string to uppercase :");
        List<String> nameUpperCase = listName.stream().map(el -> el.toUpperCase()).collect(Collectors.toList());
        nameUpperCase.forEach(System.out::println);
    }
}
