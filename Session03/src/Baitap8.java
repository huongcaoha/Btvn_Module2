import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        String str = "huongcaoha";
        System.out.println(str);
        System.out.println("Entercharacter want count ");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.nextLine().charAt(0);
        int count = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == character){
                count++ ;
            }
        }
        System.out.println("ki tự " + character + " xuất hiện " + count + " lần .");
    }
}
