package baitap1;

import java.util.Arrays;

public class Baitap1 {
    public static void main(String[] args) {
        String name = "       Nguyen Cong Huong    ";
        // kiểm tra 1 chuỗi rỗng hay ko ?
        System.out.println(name + " là 1 chuỗi rỗng : " + name.isEmpty() );

        // loai bỏ khoaảng trắng ở đầu và cuỗi
        System.out.println(name.trim());

        // kiểm tra 2 chuỗi có giôống nhau ko ?
        System.out.println(name.trim()+ " giống 'nguyen cong huong' : " + name.trim().equals("nguyen cong huong"));
        System.out.println(name.trim()+ " giống 'nguyen cong huong' : " + name.trim().equalsIgnoreCase("nguyen cong huong"));

        //tách chuỗi thành 1 mảng
        String[] arr = name.trim().split(" ");
        System.out.println(Arrays.toString(arr));

        // nối 2 chuỗi với nhau
        String name2 = " & Nguyen Thi Thu Trang";
        System.out.println(name.trim().concat(name2));

        // chuyển chữ thường trong chuỗi thành chữ hoa
        System.out.println(name.toUpperCase());

        // chuyển chữ hoa trong chuỗi thành chữ thường
        System.out.println(name.toLowerCase());

        // thay thế tất cả các ký tự chuỗi cũ thành ký tự mới
        System.out.println(name.replaceAll("\\s","_"));

        // lấy độ dài của chuỗi
        System.out.println("Độ dài của chuỗi '" + name.trim() + "' là : " + name.trim().length());
    }
}
