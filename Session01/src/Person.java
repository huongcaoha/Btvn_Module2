public class Person {
    private int id ;
    private String fullname ;
    private int age ;
    private String phoneNumber ;
    private String email ;

    public Person(int id, String fullname, int age, String phoneNumber, String email) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print(){
        System.out.printf("| %-5d | %-20s | %-10d | %-20s | %-30s |\n",this.getId(),this.getFullname(),this.getAge(),this.getPhoneNumber(),this.getEmail());
    }
}
