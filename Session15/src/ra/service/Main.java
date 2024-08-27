package ra.service;

import ra.entity.Categories;
import ra.entity.Product;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String nameFile = "listProduct.txt";
//        String currentDir = System.getProperty("user.dir");
//        String filename = currentDir + "/src/ra/database/" + nameFile;
//        List<Product> products = new ArrayList<>();
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
//            out.writeObject(products);
//            System.out.println("Save successfully !");
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        String nameFile = "listCategories.txt";
        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/ra/database/" + nameFile;
        List<Categories> categories = new ArrayList<>();
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(categories);
            System.out.println("Save successfully !");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
