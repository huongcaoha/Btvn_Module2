package bai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "bai1.txt";
        StringBuilder input = new StringBuilder();
        try(BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line ;
            while ((line = in.readLine()) != null){
                input.append(line);
            }
        }catch (IOException e){
            System.err.println("Read file error !");
        }
        String rs = input.toString();
        System.out.println("Input  : "+rs);
        List<String> arr = Arrays.asList(rs.split(" "));
        int max = arr.stream().map(String::length).max(Integer::compare).orElse(null);
        List<String> newArr = arr.stream().filter(element -> element.length() == max).toList();
        System.out.println("Longest words in file : ");
        for(String str : newArr){
            System.out.println(str);
        }
    }
}
