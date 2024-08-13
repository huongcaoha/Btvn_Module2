package ra.entity;

import java.util.Scanner;

public class Categories {
    private Integer catalogId ;
    private String catalogName ;
    private String descriptions ;
    private Boolean catalogStatus ;

    public Categories() {
    }

    public Categories(Integer catalogId, String catalogName, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    public void inputData(Scanner scanner , Categories[] categories , int index){
        catalogId = index+1 ;
        while (true){
            System.out.println("Enter catalogName (length <= 50 character ): ");
            catalogName = scanner.nextLine().trim().replaceAll("\\s+", " ");
            boolean checkName = false ;
            for(Categories cate : categories){
                if(cate.catalogName.equals(catalogName)){
                    checkName = true ;
                    break;
                }
            }
            if(catalogName.length() <= 50 && catalogName.length() > 0){
                System.err.println("Product name invalid (length > 0 & length <= 50 character) !");
            }else if (checkName){
                System.err.println("Product name exis !");
            }else  {
                break;
            }
        }

        System.out.println("Enter description :");
        descriptions = scanner.nextLine().trim().replaceAll("\\s+"," ");

        while (true){
            try {
                System.out.println("Enter category status (true or false) :");
                catalogStatus = Boolean.parseBoolean(scanner.nextLine().trim());
                break;
            }catch (Exception e){
                System.err.println("Category status invalid !");
            }
        }

    }

    public void displayData(){
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-5d | %-30s | %-30s | %-10s |\n" , catalogId,catalogName,descriptions,catalogStatus );
    }
}
