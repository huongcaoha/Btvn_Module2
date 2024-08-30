package bai1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "bai1.txt";
        String input = "Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó.";
       try( FileOutputStream out = new FileOutputStream(fileName)) {
           out.write(input.getBytes());
       }catch (IOException e){
           System.err.println("write error  !");
       }

       StringBuilder output = new StringBuilder() ;
       try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
           String line ;
           while ((line = in.readLine()) != null){
               output.append(line);
           }
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

       String[] arr = output.toString().split(" ");
       int length = arr.length;
        System.out.println(output);
        System.out.println("Chuỗi trên có : " + length + " từ !");
        System.out.println(output);
    }
}
