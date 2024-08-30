package bai6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "bai1.txt";
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line ;
            while ((line = reader.readLine()) != null){
                stringBuilder.append(line);
            }
        }catch (IOException e){
            System.err.println("Read file error !");
        }
        List<String> list = Arrays.asList(stringBuilder.toString().split(" "));
        Map<String,Integer> rs = new HashMap<>();
        for(String str : list){
            if(rs.containsKey(str)){
                rs.put(str,rs.get(str)+1);
            }else {
                rs.put(str,1);
            }
        }
        if (rs.isEmpty()){
            System.err.println("File is empty !");
        }else {

            final Integer[] max = {0};
            rs.forEach((key,value) -> {
                if(value > max[0]){
                    max[0] = value;
                }
            });
            System.out.println("Các từ được sử dụng nhiều nhất trong file :");
            rs.forEach((key,value) -> {
                if(value == max[0]){
                    System.out.println(key + " : " + max[0] + " lần .");
                }
            });
            }

        }
    }

