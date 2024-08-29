package bai11;

import bai1.Common;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter date to check valid (dd/MM/yyyy) : ");
        String date = Common.scanner.nextLine().trim();
        if(date.matches("^[0-3][0-9]/[01][0-9]/[0-9]{1,4}")){
                String[] arr = date.split("/");
                int year = Integer.parseInt(arr[2]);
                int month = Integer.parseInt(arr[1]);
                int day = Integer.parseInt(arr[0]);
                int dayOfmonth = LocalDate.of(year,month,1).lengthOfMonth();
                if(day > dayOfmonth){
                    System.err.println("Day invalid because month " + month + " have " + dayOfmonth + " day !");
                }else if(month > 12){
                    System.err.println("Month > 12 !");
                } else if (year < 1) {
                    System.err.println("Year > 0 !");
                }else {
                    System.out.println("Date valid !");
                }
        }else {
            System.err.println("Date invalid !");
        }


    }
}
