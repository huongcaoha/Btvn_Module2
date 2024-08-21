package bai9.business.feature;

import bai9.business.entity.Student;

public interface IStudentManagement {
    public void showAll();
    public void addStudent(Student student);
    public void removeStudent(int studentId);
    public Student findStudentById(int studentId);
    public Double getAverageScoreAllStudent();
    public void sortByScore();
}
