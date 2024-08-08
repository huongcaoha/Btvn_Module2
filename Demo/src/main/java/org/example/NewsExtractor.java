package org.example;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsExtractor {
    public static void main(String[] args) {
      try {
          URL url = new URL("https://dantri.com.vn/the-gioi.htm");
          Scanner scanner = new Scanner(System.in);
          String content = scanner.next();
          // close scanner
          scanner.close();
          //remove all new line
          content = content.replaceAll("\\n+","");
          Pattern p = Pattern.compile("name_song\">(.*?)</a>");
          Matcher m = p.matcher(content);
          while (m.find()){
              System.out.println(m.group(1));
          }
      } catch (MalformedURLException e) {
          e.printStackTrace();
      }catch (IOException e){
          e.printStackTrace();
      }
    }
}