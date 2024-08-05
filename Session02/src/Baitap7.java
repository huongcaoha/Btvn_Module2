import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baitap7 {
    public static void main(String[] args) {
        int number = 0 ;
        System.out.println("Bạn hãy nhập số lượng số nguyên tố đầu tiên cần tìm nhé ");
        number = Common.getInputInt(number);
        int  count = 1 ;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for(int  i = 3 ; count != number ; i+=2 ){
            if(Common.checkPrime(i)){
                primes.add(i);
                count++ ;
            }
        }
        System.out.println(number + " số nguyên tố đầu tiên là : " + primes);

    }
}
