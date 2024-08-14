package bai2.ra.Controller;

import bai2.ra.Common.Common;
import bai2.ra.Database.Data;
import bai2.ra.model.Singer;
import bai2.ra.model.Song;

public class SingerController {
//    public static void addSingers(Singer[] singers ,int currentIndex){
//        Singer singer = new Singer();
//        singer.inputData(singers,currentIndex);
//        singers[currentIndex] = singer;
//    }

    public static void displaySingers(Singer[] singers){
        System.out.printf("[ %-6s | %-30s | %-10s | %-30s | %-15s | %-30s ]\n","ID","singerName","age","nationality","gender","genre");
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

    public static void deleteSinger(){
        int idSinger = 0 ;
        idSinger = Common.getInputInt(idSinger,"Enter id singer want delete : ");
        int index = -1 ;
        for(int  i = 0 ; i <= Data.currentIndexSingers ; i++){
            if(Data.singers[i].getSingerId() == idSinger){
                index = i ;
                break;
            }
        }
        if(index < 0){
            System.err.println("Not found id singer !");
        }else {
            boolean checkSong = false ;
            for(int i = 0 ; i <= Data.currentIndexSongs ; i++){
                if(Data.songs[i].getSinger().getSingerId() == idSinger){
                    checkSong = true ;
                    break;
                }
            }
            if(checkSong){
                System.err.println("Cannot delete singer because singer has song !");
            }else {
                for(int i= index ; i < Data.currentIndexSingers ; i++){
                    Data.singers[i] = Data.singers[i+1];
                }
                Data.singers[Data.currentIndexSingers] = null ;
                Data.currentIndexSingers-- ;
                System.out.println("Delete singer successfully !");
                displaySingers(Data.singers);
            }
        }
    }

}
