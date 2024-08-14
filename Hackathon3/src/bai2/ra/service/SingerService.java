package bai2.ra.service;

import bai2.ra.Common.Common;
import bai2.ra.Controller.SingerController;
import bai2.ra.Database.Data;
import bai2.ra.model.Singer;

public class SingerService {
    public static void main(String[] args) {
       while (true){
           System.out.println("*********************************SINGER-MANAGEMENT************************************");
           System.out.println("|                 1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới                    |");
           System.out.println("|                  2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ                                                                    |");
           System.out.println("|                  3.Thay đổi thông tin ca sĩ theo mã id                                                                               |");
           System.out.println("|                  4.Xóa ca sĩ theo mã id                                                                                                         |");
           System.out.println("|                  5. Thoát                                                                                                                                   |");
           System.out.println("***********************************************************************************************");
           int choose = 0 ;
           choose = Common.getInputInt(choose,"Enter choose : ");
           switch (choose){
               case 1 : {
                   int number = 0 ;
                 number =  Common.getInputInt(number,"Enter number singer want add :");
                        for(int i = 1 ; i <= number ; i++){
                            System.out.println("Enter singer number " + i);
                            Singer singer = new Singer();
                            singer.inputData(Data.singers,Data.currentIndexSingers);
                            Data.currentIndexSingers++ ;
                            Data.singers[Data.currentIndexSingers] = singer;
                        }
                        SingerController.displaySingers(Data.singers);
                   break;
               }
               case 2 : {
                   SingerController.displaySingers(Data.singers);
                   break;
               }
               case 3 : {
                   int idSinger = 0 ;
                   idSinger = Common.getInputInt(idSinger,"Enter id singer : ");
                   SingerController.updateSinger(idSinger,Data.singers);
                   break;
               }
               case 4 : {
                 SingerController.deleteSinger();
                   break;
               }
               case 5 : {
                   return;
               }
               default: {
                   System.err.println("Enter try again !");
               }
           }
       }
    }
}
