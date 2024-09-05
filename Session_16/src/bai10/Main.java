package bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input : ");
        String input = scanner.nextLine().trim();
        StringBuilder tmp = new StringBuilder();
        String rs = "";
        for(int i = 0 ; i < input.length() ; i++){
            tmp.setLength(0);
            tmp.append(input.charAt(i));
            for(int j = i ; j < input.length()-1 ; j++){
                if(input.charAt(j) < input.charAt(j+1)){
                    tmp.append(input.charAt(j+1));
                }else {
                   break;
                }
            }
            if(tmp.length() > rs.length()){
                rs = tmp.toString() ;
            }
        }
        System.out.println("Substrings are sorted in order of greatest length : " + rs + " length = " + rs.length() );

    }
}
