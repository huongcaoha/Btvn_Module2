package baitap;

import Common.Student;
import Common.StudentPrivate;

public class Baitap5 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nguyễn Công Hưởng");
        student.setClasses("HN-JV240617");
        System.out.println(student.toString());

//        StudentPrivate studentPrivate = new StudentPrivate();
//        studentPrivate.setName("Nguyễn Công Hưởng");
//        studentPrivate.setClasses("HN-JV240617");
//        studentPrivate.toString();
    }
}
