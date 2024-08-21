package common;

import entity.Category;
import entity.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IMethod {
        public static int getIdProduct(){
            String filename = "listProduct.txt";
            List<Product> arr = new ArrayList<>();
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                arr = (List<Product>) in.readObject();
            }catch (Exception e){
                e.printStackTrace();
            }
            if(arr.size() >= 0){
                return  arr.get(arr.size()-1).getProductId() +1 ;
            }else {
                return 1 ;
            }
        }

        public static List<Category> getListCategory(){
            List<Category> categories = new ArrayList<>();
            String filename = "listCategory.txt" ;
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                categories = (List<Category>) in.readObject();
            }catch (Exception e){
                System.err.println("Get list category error !");
            }
            return categories;
        }

        public static void displayListCategory(){
            List<Category> categories = getListCategory();
            if(categories.size() == 0){
                System.out.println("List category is empty !");
            }else {
                System.out.println("*******************************************************************************************************");
                System.out.printf("[ %-10s | %-50s | %-10s | %-20s ]\n" ,"cateId" , "cateName" , "status","createdDate");
                for(Category cate : categories){
                    cate.displayData();
                }
                System.out.println("*******************************************************************************************************");
            }
        }

        public static Boolean checkExisCategory(int id){
            List<Category> categories = getListCategory();
            for(Category cate : categories){
                if(cate.getCateId() == id){
                    return true ;
                }
            }
            return false ;
        }
}
