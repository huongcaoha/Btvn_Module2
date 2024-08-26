package ra.entity;

import ra.common.IMethod;

import java.util.List;
import java.util.Scanner;

public class Categories {
    String fileName = "listCategories.txt";
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
    public void inputData(Scanner scanner){
        List<Categories> categories = IMethod.getListObject(fileName);

        getCategoryId(categories);

        inputCatalogName(scanner, categories);

        inputDescription(scanner);

        inputCatalogStatus(scanner);
    }

    public void updateData(Scanner scanner){
        List<Categories> categories = IMethod.getListObject(fileName);

        inputCatalogName(scanner, categories);

        inputDescription(scanner);

        inputCatalogStatus(scanner);
    }

    public void updateStatus(){
        this.catalogStatus = !this.catalogStatus;
    }

    private void inputCatalogStatus(Scanner scanner) {
        while (true){
            System.out.println("Enter catalog status (true = on sale ; false = off sale) : ");
            String status = scanner.nextLine().trim();
            if(status.equals("true") || status.equals("false")){
                try {
                    this.catalogStatus = Boolean.parseBoolean(status);
                    break;
                }catch (Exception e){
                    System.err.println("Status invalid !");
                }
            }else {
                System.err.println("Enter true or false !");
            }
        }
    }

    private void inputDescription(Scanner scanner) {
        while (true){
            System.out.println("Enter descriptions : ");
            this.descriptions = scanner.nextLine().trim();
            if(descriptions.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
    }

    private void inputCatalogName(Scanner scanner, List<Categories> categories) {
        while (true){
            System.out.println("Enter category name : ");
            this.catalogName = scanner.nextLine().trim();
            if(!catalogName.isEmpty() && catalogName.length() <= 50){
               boolean isExist =  categories.stream().anyMatch(el -> el.getCatalogName().equalsIgnoreCase(catalogName));
               if(isExist){
                   System.err.println("Catalog name existed !");
               }else {
                   break;
               }
            }else {
                System.err.println("Catalog name not empty & length <= 50 !");
            }
        }
    }

    public void displayData(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("[ %-6d | %-30s | %-50s | %20s ]\n" , catalogId,catalogName,descriptions,catalogStatus?"on sale" : "off sale");
    }

    private void getCategoryId(List<Categories> categories) {

        if(categories.isEmpty()){
            this.catalogId = 1 ;
        }else {
            this.catalogId = categories.getLast().getCatalogId() + 1 ;
        }
    }
}
