import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int getInputInt(int number){
        Scanner sc = new Scanner(System.in);
        boolean check =  false ;
        do {
            try {
                System.out.println("Enter number  :");
                number = Integer.parseInt(sc.nextLine());
                check = true ;
            }catch (Exception e){
                System.out.println(" invalid integer");

            }

        }while (!check);
        return number ;
    }

    public static float getInputFloat(float number){
        Scanner sc = new Scanner(System.in);
        boolean check =  false ;
        do {
            try {
                System.out.println("Enter number  :");
                number = Float.parseFloat(sc.nextLine());
                check = true ;
            }catch (Exception e){
                System.out.println(" invalid float");

            }

        }while (!check);
        return number ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // bài tập 1

//        System.out.println("Enter your name :");
//        String name = sc.nextLine();
//        System.out.println("Hello : " + name );

        // bài tập 2

//        int rate = 23000;
//        int usd = 0;
//       usd = Main.getInputInt(usd);
//        System.out.printf("%d usd = %d VND",usd,usd*rate);

        // bài tập 3
        System.out.println("Enter length square: ");
        int length = 0;
        length = Main.getInputInt(length);
        System.out.println("Enter width square :");
         int width = 0;
       width = Main.getInputInt(width);
        System.out.println("Area square : " + length * width);
        System.out.println("Premeter square : " + (length+width)*2 );

        // bài tập  4
//        System.out.println("Enter number : ");
//        long number = Long.parseLong(sc.nextLine());
//        System.out.println("Bình phương của " + number + " = " + number*number);
//        System.out.println("Lập phương của " + number + " = " + number*number*number);

        // bài tập 5
//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person(1,"Nguyen Van A" , 15 ,"0367508791","huongcaoha1991@rikkeiacademy.com"));
//        persons.add(new Person(2,"Nguyen Van B" , 16 ,"0367508792","huongcaoha1992@rikkeiacademy.com"));
//        persons.add(new Person(3,"Nguyen Van C" , 17 ,"0367508793","huongcaoha1993@rikkeiacademy.com"));
//        persons.add(new Person(4,"Nguyen Van D" , 18 ,"0367508794","huongcaoha1994@rikkeiacademy.com"));
//        persons.add(new Person(5,"Nguyen Van E" , 19 ,"0367508795","huongcaoha1995@rikkeiacademy.com"));
//        persons.add(new Person(6,"Nguyen Van F" , 20 ,"0367508796","huongcaoha1996@rikkeiacademy.com"));
//        persons.add(new Person(7,"Nguyen Van G" , 21 ,"0367508797","huongcaoha1997@rikkeiacademy.com"));
//        persons.add(new Person(8,"Nguyen Van H" , 22 ,"0367508798","huongcaoha1998@rikkeiacademy.com"));
//        persons.add(new Person(9,"Nguyen Van I" , 23 ,"0367508799","huongcaoha1999@rikkeiacademy.com"));
//        persons.add(new Person(10,"Nguyen Van K" , 24 ,"0367508790","huongcaoha1990@rikkeiacademy.com"));
//
//        System.out.printf("| %-5s | %-20s | %-10s | %-20s | %-30s |\n","STT","Ho va Ten","Tuoi","So dien thoai" ,"email");
//        for(Person person : persons){
//            person.print();
//        }

        // bài tập 6
//        System.out.println("Enter point Toan :");
//        float toan = Float.parseFloat(sc.nextLine());
//        System.out.println("Enter point Van :");
//        float van = Float.parseFloat(sc.nextLine());
//        System.out.println("Enter point Anh :");
//        float anh = Float.parseFloat(sc.nextLine());
//
//        System.out.println("Avg point = " + (toan + van + anh)/3);
    }
}