package bai5;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "baitap5.csv";
        String[] headers = { "ID", "Code", "Country" };
        String[][] data = {
                { "1", "AU", "Australia" },
                { "2", "CN", "China" },
                { "3", "AU", "Australia" },
                { "4", "CN", "China" },
                { "5", "JP", "Japan" },
                { "6", "CN", "China" },
                { "7", "JP", "Japan" },
                { "8", "TH", "Thailand" }
        };
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.join("," ,headers));
            writer.newLine();

            for (int i = 0 ; i < data.length ; i++){
                writer.write(String.join(",",data[i]));
                writer.newLine();
            }
        }catch (IOException e){
            System.err.println("Write file error !");
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line ;
            while ((line = reader.readLine()) != null){
                List<String> arr = Arrays.asList(line.split(","));
                System.out.printf("[ %-10s | %-10s | %-20s ]\n" , arr.get(0),arr.get(1),arr.get(2));
            }
        }catch (IOException e){
            System.err.println("Read file error !");
        }
    }
}
