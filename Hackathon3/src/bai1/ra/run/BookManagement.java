package bai1.ra.run;

import bai1.ra.bussiness.Book;

import java.util.Scanner;

public class BookManagement {
    public static Book[] books = new Book[100];
    public static int currentIndex = -1 ;

    public static void displayListBook(Book[] books){
        if(BookManagement.currentIndex < 0){
            System.out.println("List book empty !");
        }else {
            System.out.printf("| %-6s | %-30s | %-30s | %-30s | %-10s | %-10s | %-10s | %-10s |\n","bookId","bookName","author","descriptions","importPrice","exportPrice","interest","bookStatus");
            for(Book book : books){
                if(book != null){
                    book.displayData();
                }
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public  static void sortForInterest(Book[] books , int currentIndex){
        for(int i = 0 ; i <=  currentIndex ; i++){
            for(int j = i+1 ; j <= currentIndex ; j++ ){
                if(books[j].getInterest() < books[i].getInterest()){
                    Book tmp = books[i];
                    books[i] = books[j];
                    books[j] = tmp ;
                }
            }
        }
        System.out.println("List Book after sort is : ");
        BookManagement.displayListBook(BookManagement.books);
    }
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần ");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả ");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");
            int  choise = 0 ;
           while (true){
               try {
                   System.out.println("Enter choise : ");
                   choise = Integer.parseInt(scanner.nextLine().trim());
                   if(choise > 0 && choise < 8){
                       break;
                   }
               }catch (Exception e){
                   System.err.println("Choise invalid");
               }
           }

           switch (choise){
               case 1 : {
                   int number = 0 ;
                   while (true){
                       try {
                           System.out.println("Enter number book want add : ");
                           number = Integer.parseInt(scanner.nextLine().trim());
                           if(number > 0){
                               break;
                           }
                       }catch (Exception e){
                           System.err.println("number invalid !");
                       }
                   }
                   for(int  i = 1 ; i <= number ; i++){
                       System.out.println("Enter book number " + i );
                       Book book = new Book();
                       book.inputData(BookManagement.books,BookManagement.currentIndex);
                       BookManagement.currentIndex++ ;
                       BookManagement.books[BookManagement.currentIndex] = book ;
                       System.out.println("----------------------------------------------------------------------------------------");
                   }
                   BookManagement.displayListBook(BookManagement.books);
                   break;
               }

               case 2 : {
                   BookManagement.displayListBook(BookManagement.books);
                   break;
               }

               case 3 : {
                    BookManagement.sortForInterest(BookManagement.books,BookManagement.currentIndex);
                   break;
               }

               case 4 : {
                   int bookId = 0 ;
                  while (true){
                      try {
                          System.out.println("Enter bookId to delete : ");
                          bookId = Integer.parseInt(scanner.nextLine().trim());
                          if(bookId > 0){
                              break;
                          }
                      }catch (Exception e){
                          System.err.println("Book id invalid !");
                      }
                  }
                  int index = -1 ;
                  for(int i = 0 ; i <= BookManagement.currentIndex ;i++){
                      if(BookManagement.books[i].getBookId() == bookId){
                          index = i ;
                          break;
                      }
                  }
                  if(index < 0){
                      System.err.println("Not found book id !");
                  }else {
                      for(int i = index ; i < BookManagement.currentIndex ; i++){
                          BookManagement.books[i] = BookManagement.books[i+1];
                      }
                      BookManagement.books[BookManagement.currentIndex] = null ;
                      BookManagement.currentIndex-- ;
                      System.out.println("Delete successfully !");
                      BookManagement.displayListBook(BookManagement.books);
                  }
                   break;
               }

               case 5 : {
                   System.out.println("Enter name book or description : ");
                   String search = scanner.nextLine().trim().toLowerCase();
                   Book[] rs = new Book[100];
                   int indexRs = -1 ;
                   for(int i = 0 ; i <= BookManagement.currentIndex ; i++){
                       if(BookManagement.books[i].getBookName().toLowerCase().contains(search) || BookManagement.books[i].getDescriptions().toLowerCase().contains(search)){
                           indexRs++ ;
                           rs[indexRs] = BookManagement.books[i];
                       }
                   }
                   if(indexRs < 0){
                       System.err.println("Not found book !");
                   }else {
                       System.out.println("Result after search : ");
                       BookManagement.displayListBook(rs);
                   }
                   break;
               }

               case 6 : {
                   int idBook = 0 ;
                   while (true){
                       try {
                           System.out.println("Enter book id to update :");
                           idBook = Integer.parseInt(scanner.nextLine().trim());
                           if(idBook > 0){
                               break;
                           }else {
                               System.err.println("Enter book id > 0 !");
                           }
                       }catch (Exception e){
                           System.err.println("Book id invalid !");
                       }
                   }
                   int indexBook = -1 ;
                   for(int  i = 0 ; i <= BookManagement.currentIndex ; i++){
                       if(BookManagement.books[i].getBookId() == idBook){
                           indexBook = i ;
                           break;
                       }
                   }
                   if(indexBook < 0){
                       System.err.println("Not found id book !");
                   }else {
                       BookManagement.books[indexBook].updateBook();
                       System.out.println("Update successfully !");
                       BookManagement.displayListBook(BookManagement.books);
                   }
                   break;
               }

               case 7 : {
                   System.out.println("Goodbye !!!");
                   return;
               }
           }

        }
    }
}
