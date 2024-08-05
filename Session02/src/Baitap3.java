import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Baitap3 {
    public static void main(String[] args) {
        List<String> lt20 = new ArrayList<>(Arrays.asList("zero","one","two","three","fore","five","six","seven","eight","nine","teen","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"));
        List<String> dozens = new ArrayList<>(Arrays.asList("0","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","one hundred"));
        int input = 0 ;
        input = Common.getInputInt(input);

        if(input == 100){
            System.out.println(dozens.get(dozens.size()-1));
        }else if(input <= 20) {
            System.out.println(lt20.get(input));
        }else if(input > 20 && input < 100){
            int rowDozens = input / 10 ;
            int unit = input % 10 ;
            System.out.println(dozens.get(rowDozens) + " " + lt20.get(unit));
        }else if(input > 100 && input <= 999){
            int rowHundred = input / 100 ;
            int rsInput = input % 100 ;
            int rowDozens = rsInput / 10 ;
            int unit = rsInput % 10 ;
            if(rowDozens == 0){
                System.out.println(lt20.get(rowHundred) + " Hundred " + lt20.get(unit));
            }else {
                System.out.println(lt20.get(rowHundred) + " Hundred "+ dozens.get(rowDozens)+ " " + lt20.get(unit));
            }
        }else {
            System.out.println("Not found number !");
        }


    }
}
