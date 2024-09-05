package bai14;

import bai11.FootballTeam;

import java.util.List;

public class SortingStudent {
    public static List<Student> pubbleSort(List<Student> list){
        for(int i = 0 ; i < list.size()-1 ; i++){
            for(int j = 0 ; j < list.size()-1-i ; j++){
                if(list.get(j).getScore() < list.get(j+1).getScore()){
                    Student student = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,student);
                }
            }
        }
        return list;
    }

    public static List<Student> selectSort(List<Student> list){
        for(int i = 0 ; i < list.size()-1 ; i++){
            for(int j = i+1 ; j < list.size()-1 ; j++){
                if(list.get(i).getScore() < list.get(j).getScore()){
                    Student tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
        return list;
    }

    public static List<Student> insertionSort(List<Student> list) {
        for (int i = 1; i < list.size(); i++) {
            Student key = list.get(i);
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key đến vị trí tiếp theo của chúng
            while (j >= 0 && list.get(j).getScore() < key.getScore()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        return list;
    }
}
