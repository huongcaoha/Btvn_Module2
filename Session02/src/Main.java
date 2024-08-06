import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // bài tập 15
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String idProduct ,productName,producer;
        int yearOfFacture;
        float price ;
        while (true){
            try {
                System.out.println("Enter idProduct : (SPxxx - x = integer)");
                idProduct = scanner.nextLine();
                if(idProduct.matches("^SP[0-9]{3}$")){
                    break;
                }
            }catch (Exception e){
                System.out.println("idProduct invalid (SPxxx - x = integer)");
            }
        }

        while (true){

                System.out.println("Enter product name : (length > 5 character)");
                productName = scanner.nextLine();
                if(productName.trim().length() > 5){
                    break;
                }else {
                    System.out.println("Length product name > 5");
                }
        }

        while (true){

            System.out.println("Enter producer : (length > 5 character)");
            producer = scanner.nextLine();
            if(producer.trim().length() > 5){
                break;
            }else {
                System.out.println("Length producer > 5");
            }
        }

        while (true){
            System.out.println("Enter year of facture :");
            try {
                yearOfFacture = Integer.parseInt(scanner.nextLine());
                int currentYear = LocalDate.now().getYear();
               if(yearOfFacture < 2000 || yearOfFacture > currentYear){
                   System.out.println("Year of facture > 2000 && < currentYear !");
               }else {
                   break;
               }
            }catch (Exception e){
                System.out.println("Year of facture in valid integer !");
            }
        }

        while (true){
            System.out.println("Enter price product :(price > 0 )");
            try {
                price = Float.parseFloat(scanner.nextLine());
                if(price <= 0){
                    System.out.println("Price invalid > 0 ");
                }else {
                    break;
                }
            }catch (Exception e){
                System.out.println("Price invalid number !");
            }
        }

        System.out.println("\u001B[31m IdProduct : " + idProduct);
        System.out.println("\u001B[32m ProductName : " + productName);
        System.out.println("\u001B[33m Producer : " + producer);
        System.out.println("\u001B[34m Year of facture : " + yearOfFacture);
        System.out.println("\u001B[0m Price : " + price);
    }
}