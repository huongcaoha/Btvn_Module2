package bai14;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Student A",5.8));
        students.add(new Student(2,"Student B",3.8));
        students.add(new Student(3,"Student C",3.8));
        students.add(new Student(4,"Student D",2.8));
        students.add(new Student(5,"Student E",6.8));
        students.add(new Student(6,"Student F",7.8));
        students.add(new Student(7,"Student G",8.8));
        students.add(new Student(8,"Student H",9.8));
        students.add(new Student(9,"Student K",5.8));

        System.out.println("Array before sort : ");
        for(Student s : students){
            System.out.println(s.toString());
        }
        System.out.println();
        System.out.println();
        SortingStudent.pubbleSort(students);
        System.out.println("Array before pubble sort : ");
        for(Student s : students){
            System.out.println(s.toString());
        }
        System.out.println();
        SortingStudent.insertionSort(students);
        System.out.println("Array before  inserted sort : ");
        for(Student s : students){
            System.out.println(s.toString());
        }
        System.out.println();
        SortingStudent.selectSort(students);
        System.out.println("Array before select sort : ");
        for(Student s : students){
            System.out.println(s.toString());
        }

    }
}
