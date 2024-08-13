package ra.common;

import ra.entity.Categories;
import ra.entity.Product;

public class DisplayList {
    public  static  void displayListCategory(Categories[] categories){
        for(Categories cate : categories){
            if(cate != null){
              cate.displayData();
            }
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void displayListProduct(Product[] products){
        for(Product pro : products){
            if(pro != null){

            }
        }
    }
}
