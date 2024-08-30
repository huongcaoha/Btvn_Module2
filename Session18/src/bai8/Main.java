package bai8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static <T> List<T> getData(String nameFile){
        List<T> list = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(nameFile))) {
            list = (List<T>) in.readObject();
        }catch (Exception e){
            System.err.println("Read file error !");
        }
        return list ;
    }

    public static <T> void saveData(String nameFile , List<T> list){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nameFile))){
            out.writeObject(list);
            System.out.println("Save successfully !");
        }catch (Exception e){
            System.err.println("Read file error !");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "src/bai8/listProduct.txt";
        while (true){
            System.out.println("******************************** Product Management ***********************************");
            System.out.println("*                                                                                                                                                                                *");
            System.out.println("*                                                                       1. Add product                                                                            *");
            System.out.println("*                                                                       2. Display list product                                                               *");
            System.out.println("*                                                                       3. Search product                                                                      *");
            System.out.println("*                                                                       4. Exit                                                                                             *");
            System.out.println("*                                                                                                                                                                                *");
            System.out.println("******************************************************************************************");
            int choice = 0 ;
            while (true){
                try {
                    System.out.println("Enter choice : ");
                    choice = Integer.parseInt(scanner.nextLine().trim());
                    if(choice > 0 && choice < 5){
                        break;
                    }else {
                        System.err.println("Enter number > 0 && number < 4 !");
                    }
                }catch (NumberFormatException e){
                    System.err.println("Choice invalid !");
                }
            }
            switch (choice){
                case 1 : {
                    List<Product> products = getData(fileName);
                    int number  = 0 ;
                    while (true){
                        try {
                            System.out.println("Enter number want add : ");
                            number = Integer.parseInt(scanner.nextLine().trim());
                            if(choice > 0){
                                break;
                            }else {
                                System.err.println("Enter number > 0 && number < 4 !");
                            }
                        }catch (NumberFormatException e){
                            System.err.println("Choice invalid !");
                        }
                    }
                    for(int i = 1 ; i <= number ; i++){
                        System.out.println("Enter product " + i );
                        Product product = new Product();
                        product.inputData(scanner);
                        products.add(product);
                        saveData(fileName,products);
                    }
                    System.out.println("Add successfully " + number + " product !");
                    break;
                }
                case 2 : {
                    List<Product> products = getData(fileName);
                    if(products.isEmpty()){
                        System.err.println("List product is empty !");
                    }else {
                        System.out.println("************************** List Product ***************************");
                        for(Product pro : products){
                            System.out.println(pro.toString());
                        }
                    }
                    break;
                }
                case 3 : {
                    List<Product> products = getData(fileName);
                    String search = "" ;
                    while (true){
                        System.out.println("Enter name product want search :");
                        search = scanner.nextLine().trim();
                        if(search.isEmpty()){
                            System.out.println("Cannot be left blank !");
                        }else {
                            break;
                        }
                    }
                    String finalSearch = search;
                    List<Product> rs = products.stream().filter(product -> product.getProductName().equalsIgnoreCase(finalSearch)).toList();
                    if(rs.isEmpty()){
                        System.err.println("Not found product !");
                    }else {
                        System.out.println("Result search : ");
                        for(Product pro : rs){
                            System.out.println(pro.toString());
                        }
                    }
                    break;
                }
                case 4 : {
                    System.out.println("Goodbye !!!");
                    return;
                }
            }
        }
    }
}
