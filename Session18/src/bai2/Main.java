package bai2;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String fileRoot = "bai1.txt";
        String fileTarget = "cloneFileBai1.txt";
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
        try( FileOutputStream out = new FileOutputStream(fileTarget)) {
            out.write(rs.getBytes());
        }catch (IOException e){
            System.err.println("write error  !");
        }
    }

}
