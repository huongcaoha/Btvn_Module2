package ra.service;

import ra.common.IMethod;
import ra.entity.Categories;
import ra.entity.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService {
   static Scanner scanner = new Scanner(System.in);
   static  String fileName = "listProduct.txt" ;
   static  String fileNameCategories = "listCategories.txt" ;
    public static void displayListProduct(List<Product> products){
        if(products.isEmpty()){
            System.err.println("List product is empty !");
        }else {
            System.out.println("*************************** List Product *******************************");
            for(Product pro : products){
                pro.displayData();
            }
        }
    }

    public static boolean addProduct(){
        List<Product> products = IMethod.getListObject(fileName);
        List<Categories> categories = IMethod.getListObject(fileNameCategories);
        if(categories.isEmpty()){
            System.err.println("Categories is empty ! Please add categories first !");
            return false ;
        }
        int number = 0 ;
        number = IMethod.getNumber(scanner , number , "Enter number product want add : ");
        for(int i = 1 ; i <= number ; i++){
            System.out.println("Enter product number " + i);
            Product product = new Product() ;
            product.inputData(scanner);
            products.add(product) ;
            IMethod.saveDatabase(fileName,products);
        }
        boolean rs = IMethod.saveDatabase(fileName,products);
        if(rs){
            System.out.println("Add successfully " + number + " product !");
            return true ;
        }else {
            System.out.println("Add product error !");
            return false ;
        }
    }

    public static void sortProductByPrice(){
        List<Product> products = IMethod.getListObject(fileName);
        List<Product> newProduct = products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).toList();
        System.out.println("List product after sort : ");
        displayListProduct(newProduct);
    }

    public static void updateProduct(){
        List<Product> products = IMethod.getListObject(fileName);
        String idProduct = "" ;
        while (true){
            System.out.println("Enter id product to update :");
            idProduct = scanner.nextLine().trim();
            if(idProduct.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < products.size() ; i++){
            if(products.get(i).getProductId().equalsIgnoreCase(idProduct)){
                index = i ;
                break;
            }
        }
        if(index < 0){
            System.out.println("Not found id product !");
        }else {
            products.get(index).updateData(scanner);
            IMethod.saveDatabase(fileName,products);
            System.out.println("Update product  successfully !");
        }
    }

    public static boolean deleteProduct(){
        List<Product> products = IMethod.getListObject(fileName);
        String idProduct = "" ;
        while (true){
            System.out.println("Enter id product to delete :");
            idProduct = scanner.nextLine().trim();
            if(idProduct.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < products.size() ; i++){
            if(products.get(i).getProductId().equalsIgnoreCase(idProduct)){
                index = i ;
                break;
            }
        }
        if(index < 0){
            System.out.println("Not found id product !");
            return false ;
        }else {
           products.remove(index);
            IMethod.saveDatabase(fileName,products);
            System.out.println("Remove product successfully !");
            return true ;
        }
    }

    public static void searchProductByName(){
        List<Product> products = IMethod.getListObject(fileName);
        String search = "" ;
        while (true){
            System.out.println("Enter name product to search :");
            search = scanner.nextLine().trim();
            if(search.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        String finalSearch = search;
        List<Product> newProduct = products.stream().filter(product -> product.getProductName().contains(finalSearch)).toList();
        System.out.println("Result of search : " + finalSearch);
        displayListProduct(newProduct);
    }

    public static  void searchProductByPriceRange(){
        List<Product> products = IMethod.getListObject(fileName);
        double min = 0 , max = 0  ;
        while (true){
            try {
                System.out.println("Enter min price :");
                min = Double.parseDouble(scanner.nextLine().trim());
                if(min >= 0){
                    break;
                }else {
                    System.out.println("Enter min price >= 0 !");
                }
            }catch (Exception e){
                System.out.println("Min price invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter max price :");
                max = Double.parseDouble(scanner.nextLine().trim());
                if(max >= 0 && max > min){
                    break;
                }else {
                    System.out.println("Enter min price >= 0 & max price > min price  !");
                }
            }catch (Exception e){
                System.out.println("Max price invalid !");
            }
        }
        double finalMin = min ;
        double finalMax = max ;
        List<Product> rs = products.stream().filter(product -> product.getPrice()>= finalMin && product.getPrice() <= finalMax).toList();
        System.out.println("Result of search min price " + finalMin + " -> max price " + finalMax + " :  ");
        displayListProduct(rs);
    }
}
