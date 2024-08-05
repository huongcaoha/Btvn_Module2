import java.util.ArrayList;
import java.util.List;

public class Baitap5 {
    public static void main(String[] args) {
        int start = 0 ;
        System.out.println("Number start ");
        start = Common.getInputInt(start);

        int end = 0 ;
        System.out.println("Number end ");
        end = Common.getInputInt(end);

        List<Integer> arrEven = new ArrayList<>();
        int sum = 0 ;
        for(int  i = start ; i <= end ; i++){
            if(i % 2 == 0){
                sum += i ;
                arrEven.add(i) ;
            }
        }
        System.out.println("Các số chắn trong khoảng từ " + start + " đến " + end + " là : " + arrEven);
        System.out.println("Tổng các số chắn là : " + sum);
    }
}
