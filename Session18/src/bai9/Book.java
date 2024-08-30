package bai9;

import bai8.Main;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Book implements Serializable {
    private Integer id ;
    private String bookName ;
    private String author ;
    private String publisher ;
    private Double price ;

    public Book() {
    }

    public Book(Integer id, String bookName, String author, String publisher, Double price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void inputData(Scanner scanner){
        String fileName = "src/bai9/listBook.txt";
        List<Book> books = Main.getData(fileName);
        this.id = books.stream().map(Book::getId).max(Integer::compare).orElse(0)+1 ;

        while (true){
            System.out.println("Enter book name : ");
            this.bookName = scanner.nextLine().trim();
            if(books.stream().anyMatch(book -> book.bookName.equalsIgnoreCase(this.bookName)) && !this.bookName.isEmpty()){
                System.err.println("Book name existed !");
            }else {
                break;
            }
        }

        while (true){
            System.out.println("Enter author :");
            this.author = scanner.nextLine().trim();
            if(author.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }

        while (true){
            System.out.println("Enter publisher :");
            this.publisher = scanner.nextLine().trim();
            if(publisher.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }

        while (true){
            try {
                System.out.println("Enter price :");
                this.price = Double.parseDouble(scanner.nextLine().trim());
                if(price > 0){
                    break;
                }else {
                    System.err.println("Enter price > 0 !");
                }
            }catch (Exception e){
                System.err.println("Price invalid !");
            }
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
