package bai2.ra.Controller;

import bai2.ra.Database.Data;
import bai2.ra.model.Singer;

public class SingerController {
//    public static void addSingers(Singer[] singers ,int currentIndex){
//        Singer singer = new Singer();
//        singer.inputData(singers,currentIndex);
//        singers[currentIndex] = singer;
//    }

    public static void displaySingers(Singer[] singers){
        System.out.printf("| %-6s | %-30s | %-10s | %-30s | %-15s | %-30s |\n","ID","singerName","age","nationality","gender","genre");
        for(Singer singer : singers){
            if(singer != null){
                singer.displayData();
            }else {
                break;
            }
        }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void updateSinger(int id ,Singer[] singers){
        int index = -1 ;
        for(int i = 0  ; i < singers.length ; i++){
            if(singers[i] == null){
                break;
            }else {
                if(singers[i].getSingerId() == id){
                    index = i ;
                    break;
                }
            }
        }
        if(index < 0){
            System.out.println("Not found singer !");
        }else {
            singers[index].updateData();
            System.out.println("Update successfully !");
            displaySingers(Data.singers);
        }
    }

    public static void deleteSinger(int id ,Singer[] singers,int currentIndex){
        int index = -1 ;
        for(int i = 0  ; i < singers.length ; i++){
            if(singers[i] == null){
                break;
            }else {
                if(singers[i].getSingerId() == id){
                    index = i ;
                    break;
                }
            }
        }
        if(index < 0){
            System.out.println("Not found singer !");
        }else {
            for(int i = index ; i < currentIndex ; i++){
                Singer tmp = singers[i];
                singers[i] = singers[i+1];
                singers[i+1] = tmp ;
            }
            singers[currentIndex] = null ;
            System.out.println("Delete successfully !");
            displaySingers(Data.singers);
        }
    }

}
