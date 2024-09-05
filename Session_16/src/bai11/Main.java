package bai11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<FootballTeam> pubbleSort(List<FootballTeam> list){
        for(int i = 0 ; i < list.size()-1 ; i++){
            for(int j = 0 ; j < list.size()-1-i ; j++){
                if(list.get(j).getScore() < list.get(j+1).getScore()){
                    FootballTeam tmp = list.get(j);
                  list.set(j,list.get(j+1));
                  list.set(j+1,tmp);
                }
            }
        }
        return list;
    }

    public static List<FootballTeam> selectSort(List<FootballTeam> list){
            for(int i = 0 ; i < list.size()-1 ; i++){
                for(int j = i+1 ; j < list.size()-1 ; j++){
                    if(list.get(i).getScore() < list.get(j).getScore()){
                        FootballTeam tmp = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j,tmp);
                    }
                }
            }
        return list;
    }

    public static List<FootballTeam> quickSort(List<FootballTeam> list){
            int piot = list.get(0).getScore();
        List<FootballTeam> first = new ArrayList<>();
        List<FootballTeam> last = new ArrayList<>();
        List<FootballTeam> mid = new ArrayList<>();

        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).getScore() > piot){
                first.add(list.get(i));
            } else if (list.get(i).getScore() < piot) {
                last.add(list.get(i));
            }else {
                mid.add(list.get(i));
            }
        }

        if(first.size() > 2){
          first =  quickSort(first);
        }else {
            if(first.size() == 2){
                if(first.get(0).getScore() < first.get(1).getScore()){
                    FootballTeam tmp = first.get(0);
                    first.set(0,first.get(1));
                    first.set(1,tmp);
                }
            }
        }

        if(last.size() > 2){
         last =  quickSort(last);
        }else {
            if(last.size() == 2){
                if(last.get(0).getScore() < last.get(1).getScore()){
                    FootballTeam tmp = last.get(0);
                    last.set(0,last.get(1));
                    last.set(1,tmp);
                }
            }
        }
     List<FootballTeam> rs = new ArrayList<>();
        rs.addAll(first);
        rs.addAll(mid);
        rs.addAll(last);
        return rs ;
    }
    public static void main(String[] args) {
        List<FootballTeam> list = new ArrayList<>();
        FootballTeam team1 = new FootballTeam(1,"team1",10,5);
        FootballTeam team2 = new FootballTeam(2,"team2",10,3);
        FootballTeam team3 = new FootballTeam(3,"team3",10,9);
        FootballTeam team4 = new FootballTeam(4,"team4",10,15);
        FootballTeam team5 = new FootballTeam(5,"team5",10,1);
        FootballTeam team6 = new FootballTeam(6,"team6",10,20);
        FootballTeam team7 = new FootballTeam(7,"team7",10,13);
        list.addAll(Arrays.asList(team1,team2,team3,team4,team5,team6,team7));
        System.out.println("Array before sort :");
        for(FootballTeam f : list){
            System.out.println(f.toString());
        }
        System.out.println();
        System.out.println("Array after pubble sort : ");
        pubbleSort(list);
        for(FootballTeam f : list){
            System.out.println(f.toString());
        }
        System.out.println();
        System.out.println("Array after selected sort : ");
        selectSort(list);
        for(FootballTeam f : list){
            System.out.println(f.toString());
        }

        System.out.println();
        System.out.println("Array after quick sort : ");
        quickSort(list);
        for(FootballTeam f : list){
            System.out.println(f.toString());
        }
    }
}
