package Common;

public class MyClass {
    private String myString ;

    public MyClass(String myString) {
        this.myString = myString;
    }

    public MyClass() {
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "myString='" + myString + '\'' +
                '}';
    }


}
