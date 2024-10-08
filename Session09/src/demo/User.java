package demo;

public class User  implements Comparable<User>{
    private String name ;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }

    public void display(){
        System.out.println("Name : " + name + " | Age : " + age);
    }
}
