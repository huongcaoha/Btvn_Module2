package bai2.ra.service;

import bai2.ra.Common.Common;
import bai2.ra.Controller.SongController;
import bai2.ra.Database.Data;
import bai2.ra.model.Song;

import java.util.Scanner;

public class SongService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("********************************SONG-MANAGEMENT***********************************");
            System.out.println("|              1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới             |");
            System.out.println("|              2.Hiển thị danh sách tất cả bài hát đã lưu trữ                                                             |");
            System.out.println("|              3.Thay đổi thông tin bài hát theo mã id                                                                        |");
            System.out.println("|              4.Xóa bài hát theo mã id                                                                                                  |");
            System.out.println("|              5. Thoát                                                                                                                                |");
            System.out.println("*******************************************************************************************");
            int choice = 0 ;
            choice = Common.getInputInt(choice,"Enter choice : ");
            switch (choice){
                case 1 : {
                            if(Data.currentIndexSingers < 0){
                                System.err.println("Please add singers first");
                                SingerService.main(args);
                            }else {
                                int number = 0 ;
                                number = Common.getInputInt(number,"Enter number song wan add : ");
                                for(int i = 1 ; i <= number ; i++){
                                    System.out.println("Enter song number " + i );
                                    Song song = new Song();
                                    song.inputData(Data.singers,Data.currentIndexSingers,Data.songs,Data.currentIndexSongs);
                                    if(song == null){
                                        SingerService.main(args);
                                    }else {
                                        Data.currentIndexSongs++ ;
                                        Data.songs[Data.currentIndexSongs] = song ;
                                    }
                                }
                                System.out.println("Add successfully "+ number + " song !");
                                SongController.displayAllSongs(Data.songs);
                            }
                    break;
                }
                case 2 : {
                    SongController.displayAllSongs(Data.songs);
                    break;
                }
                case 3 : {
                   SongController.updateSong(Data.songs,Data.currentIndexSongs,Data.currentIndexSingers);
                    break;
                }
                case 4 : {
                    SongController.deleteSong();
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
