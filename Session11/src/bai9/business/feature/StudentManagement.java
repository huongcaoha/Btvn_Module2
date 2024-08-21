package bai9.business.feature;

import bai9.business.data.Data;
import bai9.business.entity.Student;

import java.util.Comparator;

public class StudentManagement implements IStudentManagement{
    @Override
    public void showAll() {
        if(Data.students.size() == 0){
            System.err.println("List is empty !");
        }else {
            System.out.println("*************************** List Student ****************************");
            for(Student s : Data.students){
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void addStudent(Student student) {
            Data.students.add(student);
    }

    @Override
    public void removeStudent(int studentId) {
        int index = -1 ;
        for(int i = 0 ; i < Data.students.size() ; i++){
            if(Data.students.get(i).getStudentId() == studentId){
                index = i ;
                break;
            }
        }
        if(index == -1 ){
            System.err.println("Not found id !");
        }else {
            Data.students.remove(index);
            System.out.println("Remove successfully  !");
        }
    }

    @Override
    public Student findStudentById(int studentId) {

        for(int i = 0 ; i < Data.students.size() ; i++){
            if(Data.students.get(i).getStudentId() == studentId){
                return Data.students.get(i);
            }
        }
        return null ;
    }

    @Override
    public Double getAverageScoreAllStudent() {
       double sum = 0 ;
       for(Student s : Data.students){
           sum += s.getAvgScore();
       }
       return sum / Data.students.size();
    }

    @Override
    public  void sortByScore() {
        Data.students.sort(Comparator.comparingDouble(Student::getAvgScore));
        showAll();
    }
}
