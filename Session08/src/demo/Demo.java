package demo;

import bai1.Circle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> arr = new ArrayList<>();
//        for(int i = 1 ; i <= 10 ; i++){
//            Person circle = new Person( "Nguyễn Văn " + i , i+20 ,i % 2 == 0 ? false: true );
//            arr.add(circle);
//        }
        String fileName = "ListPersons.abc";
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
//            out.writeObject(arr);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        List<Person> rs = new ArrayList<>() ;

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            rs = (List<Person>) in.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }

        for (Person person : rs){
           person.displayData();
        }
    }


}
