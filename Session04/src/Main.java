import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPrime(int number){
        boolean check = true ;
        if( number == 1){
            return  false ;
        }else if(number == 2){
            return true ;
        }
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0){
                check = false ;
                break ;
            }
        }
        return check ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0 ;
        int n2 = 0 ;

        while (true){
            System.out.println("Enter n2 (n1 < n2 ) :");
            try {
                n2 = Integer.parseInt(scanner.nextLine());
                break ;
            }catch (Exception e){
                System.out.println("Please try again n1 < n2 !");
            }
        }

        while (true){
            System.out.println("Enter n1 (n1 < n2 ) :");
            try {
                n1 = Integer.parseInt(scanner.nextLine());
                if(n1 < n2){
                    break;
                }
            }catch (Exception e){
                System.out.println("Please try again n1 < n2 !");
            }
        }

        int sumodd = 0 ;
        for(int i = n1 ; i <= n2 ; i++){
            if(i % 2 == 1){
                sumodd += i ;
            }
        }
        System.out.println("Tổng các số lẻ : " + sumodd);



        System.out.println("Các số nguyên tố từ " + n1 + " đến " + n2 + " :");

        for(int i = n1 ; i <= n2 ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }
}