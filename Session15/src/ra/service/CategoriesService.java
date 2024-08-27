package ra.service;

import ra.common.IMethod;
import ra.entity.Categories;
import ra.entity.Product;

import java.util.List;
import java.util.Scanner;

public class CategoriesService {
    static  String fileName = "listCategories.txt";
    static String fileNameProduct = "listProduct.txt" ;
    static  Scanner scanner = new Scanner(System.in);
    public static void displayListCategories(List<Categories> categories){
        if(categories.isEmpty()){
            System.err.println("List categories is empty !");
        }else {
            System.out.println("************************************** List Categories ****************************************");
            for(Categories cate : categories){
                cate.displayData();
            }
        }
    }

    public static void addCategories(){
        List<Categories> categories = IMethod.getListObject(fileName);
        int number = 0 ;
        number = IMethod.getNumber(scanner,number,"Enter number categories want add : ");
        for(int i = 1 ; i <= number ; i++){
            System.out.println("Enter categories number " + i);
            Categories cate = new Categories();
            cate.inputData(scanner);
            categories.add(cate);
            IMethod.saveDatabase(fileName,categories);
        }
        boolean rs = IMethod.saveDatabase(fileName,categories);
        if(rs){
            System.out.println("Add successfully " + number + " categories !");
            displayListCategories(categories);
        }else {
            System.out.println("Add error !");
        }
    }

    public static void updateCategories(){
        List<Categories> categories = IMethod.getListObject(fileName);
        int cateId = 0;
        while (true){
            try {
                System.out.println("Enter category id to udpate :");
                cateId = Integer.parseInt(scanner.nextLine().trim());
                if(cateId > 0){
                    break;
                }else {
                    System.err.println("Enter cate id > 0 !");
                }
            }catch (Exception e){
                System.err.println("Categories invalid !");
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < categories.size() ; i++){
            if(categories.get(i).getCatalogId() == cateId){
                index = i ;
                break;
            }
        }
        if(index >= 0){
            categories.get(index).updateData(scanner);
            IMethod.saveDatabase(fileName,categories);
            System.out.println("Update category successfully !");
        }else {
            System.err.println("Not found cate id !");
        }
    }

    public static boolean updateCategoriesStatus(){
        List<Categories> categories = IMethod.getListObject(fileName);
        int cateId = 0;
        while (true){
            try {
                System.out.println("Enter category id to update status  :");
                cateId = Integer.parseInt(scanner.nextLine().trim());
                if(cateId > 0){
                    break;
                }else {
                    System.err.println("Enter cate id > 0 !");
                }
            }catch (Exception e){
                System.err.println("Categories invalid !");
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < categories.size() ; i++){
            if(categories.get(i).getCatalogId() == cateId){
                index = i ;
                break;
            }
        }
        if(index >= 0){
            categories.get(index).updateStatus();
            IMethod.saveDatabase(fileName,categories);
            System.out.println("Update status category successfully !");
            return true ;
        }else {
            System.err.println("Not found cate id !");
            return false ;
        }
    }

    public static void deleteCategories(){
        List<Categories> categories = IMethod.getListObject(fileName);
        List<Product> products = IMethod.getListObject(fileNameProduct);
        int cateId = 0;
        while (true){
            try {
                System.out.println("Enter category id to delete:");
                cateId = Integer.parseInt(scanner.nextLine().trim());
                if(cateId > 0){
                    break;
                }else {
                    System.err.println("Enter cate id > 0 !");
                }
            }catch (Exception e){
                System.err.println("Categories invalid !");
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < categories.size() ; i++){
            if(categories.get(i).getCatalogId() == cateId){
                index = i ;
                break;
            }
        }
        if(index >= 0){
            int finalCateId = cateId;
            if(products.stream().anyMatch(product -> product.getCatalogId() == finalCateId)){
                System.err.println("Cannot delete  because this category has product !");
            }else {
                categories.remove(index);
                IMethod.saveDatabase(fileName,categories);
                System.out.println("Delete category successfully !");
            }
        }else {
            System.err.println("Not found cate id !");
        }
    }

}
