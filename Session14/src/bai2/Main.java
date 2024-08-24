package bai2;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // get time of  Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId sao_pauloZone = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime timeTokyo = ZonedDateTime.now(tokyoZone);
        ZonedDateTime timeSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime timeSao_Paulo = ZonedDateTime.now(sao_pauloZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Time zone of Tokyo : " + formatter.format(timeTokyo));
        System.out.println("Time zone of Sydney : " + formatter.format(timeSydney));
        System.out.println("Time zone of Tokyo : " + formatter.format(timeSao_Paulo) + "\n");

        //get current time
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time : " + formatterTime.format(currentTime));

        //get number day of month
       int dayOfMonth = LocalDate.now().lengthOfMonth();
        System.out.println("This month have : " + dayOfMonth + " day !\n");

        //get number day of year
        int dayOfYear = LocalDate.now().lengthOfYear();
        System.out.println("This year have : " + dayOfYear + " day !\n");

        // converse string to LocalDate
        String date = "24/08/2024";
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       try {
          LocalDate date1 = LocalDate.parse(date,dateTimeFormatter);
           System.out.println("String after converse to LocalDate : " + date1);
       }catch (Exception e){
           e.printStackTrace();
       }

        //converse LocalDate  to String dd/MM/yyyy
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate after converse to dd/MM/yyyy : " + dateTimeFormatter.format(localDate));

        //converse LocalDate  to String dd/MM/yyyy HH:mm:ss
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDate after converse to dd/MM/yyyy  HH:mm:ss ->  " + formatter.format(localDateTime));

        //compare two LocalDate return int
        LocalDate date1 = LocalDate.of(1994,8,23);
        LocalDate date2 = LocalDate.of(1992,12,29);
        int rsCompareDate = date1.compareTo(date2);
        System.out.println("Result of compare date " + dateTimeFormatter.format(date1) + " & " + dateTimeFormatter.format(date2) + " = " + rsCompareDate);

        //compare two LocalTime return int
        LocalTime time1 = LocalTime.of(12,59,0);
        LocalTime time2 = LocalTime.of(15,59,8);
        int rsCompareTime = time1.compareTo(time2);
        if(rsCompareTime > 0){
            System.out.println("Result compare time : " +formatterTime.format(time1) + " > " + formatterTime.format(time2));
        } else if (rsCompareTime < 0) {
            System.out.println("Result compare time : " +formatterTime.format(time1) + " < " + formatterTime.format(time2));
        }else {
            System.out.println("Result compare time : " +formatterTime.format(time1) + " = " + formatterTime.format(time2));
        }

        //write programing + - date , hour , minute , seconds
        Scanner scanner = new Scanner(System.in);
        int day = 0 , hour = 0 ,minute = 0 , seconds = 0 ;
        while (true){
            try {
                System.out.println("Enter day of month :");
                day = Integer.parseInt(scanner.nextLine().trim());
                if(day > 0 && day <= 31){
                    if (day == 31 && LocalDate.now().getDayOfMonth() < 31){
                        System.out.println("Day invalid because this month have day < 31 !");
                    }else {
                        break;
                    }
                }else {
                    System.err.println("Enter day > 0 & day <= 31 !");
                }
            }catch (Exception e){
                System.out.println("Day invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter hour  :");
                hour = Integer.parseInt(scanner.nextLine().trim());
                if(hour >= 0 && hour <= 23){
                    break;
                }else {
                    System.err.println("Enter hour >= 0 & hour <= 23 !");
                }
            }catch (Exception e){
                System.out.println("Hour invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter minute  :");
                minute = Integer.parseInt(scanner.nextLine().trim());
                if(minute >= 0 && minute <= 59){
                    break;
                }else {
                    System.err.println("Enter minute >= 0 & minute <= 59 !");
                }
            }catch (Exception e){
                System.out.println("Minute invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter seconds  :");
                seconds = Integer.parseInt(scanner.nextLine().trim());
                if(seconds >= 0 && seconds <= 59){
                    break;
                }else {
                    System.err.println("Enter seconds >= 0 & seconds <= 59 !");
                }
            }catch (Exception e){
                System.out.println("Seconds invalid !");
            }
        }
        LocalDateTime rsInput = LocalDateTime.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),day,hour,minute,seconds);
        System.out.println("Resulut of input : " + formatter.format(rsInput));

        rsInput = rsInput.plusDays(2).plusHours(-5).plusMinutes(8).plusSeconds(-10);
        System.out.println("After i edit day + 2 , hour - 5 , minute + 8 , seconds -10 : " + formatter.format(rsInput));

        //wrire programing calculator of LocalDate
        LocalDate current = LocalDate.now();
        System.out.println("Current date : " + dateTimeFormatter.format(current));

        LocalDate nextday = current.plusDays(1);
        System.out.println("Next day is : " + dateTimeFormatter.format(nextday));

        LocalDate preday = current.plusDays(-1);
        System.out.println("Pre day is : " + dateTimeFormatter.format(preday));

    }
}
