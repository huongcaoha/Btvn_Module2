package baitap2;

public class Baitap2 {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Nguyen Cong Huong");

        // nối chuỗi
        System.out.println(name.append(" VIP"));

        // chèn chuỗi tại 1 vị trí chỉ định
        System.out.println(name.insert(6, " VIP"));

        // thay thế 1 chuỗi từ vị trí x đến vị trí y
        System.out.println(name.replace(16,name.length()-1,"Phuong"));

        //xóa 1 chuỗi từ vị trí x đến vị trí y
        System.out.println(name.delete(0,6));

        // lấy độ dài của  chuỗi
        System.out.println(name + " có : " + name.length() + " ký tự");

        // đảo ngược chuỗi
        System.out.println(name + " sau khi đảo ngược là : " + name.reverse());
    }
}
