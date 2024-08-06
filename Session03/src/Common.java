import java.util.Scanner;

public class Common {
   static Scanner scanner = new Scanner(System.in);
    public static int getInputInt(int number){
       do {
           System.out.println("Enter number : ");
           try {
               number = Integer.parseInt(scanner.nextLine());
               break;
           }catch (Exception e){
               System.out.println("Enter valid integer !");
           }
       }while (true);
       return  number ;
    }
    public static float getInputFloat(float number){
        do {
            System.out.println("Enter number : ");
            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Enter valid number !");
            }
        }while (true);
        return  number ;
    }
}
