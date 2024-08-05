public class baitap2 {
    public static void main(String[] args) {
        int input = 0 ;
        input = Common.getInputInt(input);
        if(input % 3 == 0 && input % 5 == 0){
            System.out.println("Chia het cho ca 3 va 5");
        } else if (input % 3 == 0) {
            System.out.println("Chi chia het cho 3");
        } else if (input % 5 == 0) {
            System.out.println("Chỉ chia het cho 5");
        }else {
            System.out.println("Khong cho het cho 3 , cung khong chia het cho 5");
        }
    }
}
