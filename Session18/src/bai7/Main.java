package bai7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/bai7/listStudent.txt";
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyễn Văn A" , 15));
        students.add(new Student(2,"Nguyễn Văn B" , 16));
        students.add(new Student(3,"Nguyễn Văn C" , 17));
        students.add(new Student(4,"Nguyễn Văn D" , 18));
        students.add(new Student(5,"Nguyễn Văn E" , 19));
        students.add(new Student(6,"Nguyễn Văn F" , 20));
        students.add(new Student(7,"Nguyễn Văn G" , 21));

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(students);
            System.out.println("Write file successfully !");
        }catch (IOException e){
            System.err.println("Write file error !");
        }

        List<Student> newList = new ArrayList<>();
        try(ObjectInputStream in  = new ObjectInputStream(new FileInputStream(fileName))) {
            newList = (List<Student>) in.readObject();
        }catch (IOException e){
            System.err.println("Read file successfully !");
        } catch (ClassNotFoundException e) {
            System.err.println("Read file successfully !");
        }
        if(newList.isEmpty()){
            System.err.println("File is empty !");
        }else {
            for (Student stu : newList){
                System.out.println(stu.toString());
            }
        }
    }
}
