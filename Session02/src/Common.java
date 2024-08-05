import java.util.Scanner;

public class Common {
    public static int getInputInt(int number){
        Scanner scanner = new Scanner(System.in);
        boolean check = false ;
        do {
           try {
               System.out.println("Enter number :");
               number = Integer.parseInt(scanner.nextLine());
               check = true ;
           }catch (Exception e){
               System.out.println("Enter invalid number !");
           }
        }while (!check);
        return number ;
    }

    public static float getInputFloat(float number){
        Scanner scanner = new Scanner(System.in);
        boolean check = false ;
        do {
            try {
                System.out.println("Enter number :");
                number = Float.parseFloat(scanner.nextLine());
                check = true ;
            }catch (Exception e){
                System.out.println("Enter invalid number !");
            }
        }while (!check);
        return number ;
    }

    public static boolean checkPrime(int number){
        boolean check = true ;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0){
                check = false ;
                break;
            }
        }
        return check ;
    }


}
