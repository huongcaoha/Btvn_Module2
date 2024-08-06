package Common;

public class StudentPrivate {
    private String name = "John";
    private String classes = "C02";

    public StudentPrivate() {
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "StudentPrivate{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
