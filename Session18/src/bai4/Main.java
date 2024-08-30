package bai4;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileRoot = "bai1.txt";
        String fileTarget = "cloneFileBai4.txt";
        StringBuilder output = new StringBuilder() ;
        try(BufferedReader in = new BufferedReader(new FileReader(fileRoot))) {
            String line ;
            while ((line = in.readLine()) != null){
                output.append(line);
            }
        }catch (IOException e){
            System.err.println("Read error !");
        }
        String rs = output.toString();
        List<String> list = Arrays.asList(rs.split(" "));
        list = list.reversed();
        StringBuilder input = new StringBuilder();
        for(String str : list){
            input.append(str);
            input.append(" ");
        }

        try( FileOutputStream out = new FileOutputStream(fileTarget)) {
            out.write(input.toString().getBytes());
        }catch (IOException e){
            System.err.println("write error  !");
        }


    }
}
