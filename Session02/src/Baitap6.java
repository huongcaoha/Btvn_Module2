public class Baitap6 {
    public static void main(String[] args) {
        int start = 11 ;
        boolean check = false ;
        while (!check){
            if(start % 5 == 0 && start % 7 == 0 && start % 11 == 0){
                System.out.println("Số nguyên dương nh nhất chia hết cho cả 5 , 7 và 11 là : " + start);
                check = true ;
            }else {
                start++ ;
            }
        }
    }
}
