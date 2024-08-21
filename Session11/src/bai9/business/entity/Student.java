package bai9.business.entity;
public class Student {
    private static Integer current = 1 ;
    private Integer studentId ;
    private String name ;
    private Double avgScore ;

    public Student() {
        studentId = current;
        current++;
    }

    public Student(String name, Double avgScore) {
        this.name = name;
        this.avgScore = avgScore;
    }

    public void input(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
