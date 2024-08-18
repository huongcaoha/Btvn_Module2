package demo;

import java.io.Serializable;
public class Person implements Serializable {
    private  static  int index = 0 ;
    private int  id ;
        private String name ;
        private Integer age ;
        private Boolean gender ;

    public Person() {
        index++ ;
        this.id = index ;
    }

    public Person( String name, Integer age, Boolean gender) {
        index++;
        this.id = index;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Person.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public void displayData(){
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.printf("[ %-10d | %-50s | %-10d | %-15s ]\n" , id,name,age,gender);
    }
}
