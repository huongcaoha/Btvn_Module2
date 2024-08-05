public class Baitap4 {
    public static void main(String[] args) {
        float toan = 0 ;
        float ly = 0 ;
        float hoa = 0 ;
        float van = 0 ;
        float anh = 0 ;
        System.out.println("Điểm toán :");
        toan = Common.getInputFloat(toan);

        System.out.println("Điểm lý :");
        ly = Common.getInputFloat(ly);

        System.out.println("Điểm hóa :");
        hoa = Common.getInputFloat(hoa);

        System.out.println("Điểm văn :");
        van = Common.getInputFloat(van);

        System.out.println("Điểm anh :");
        anh = Common.getInputFloat(anh);

        float avg = (toan + ly + hoa + van + anh) / 5 ;
        System.out.println("Điểm trung bình của bạn là : " + avg);
        if(avg >= 0 && avg < 5){
            System.out.println("Bạn xếp loại yếu !");
        }else if(avg >= 5 && avg < 6.5){
            System.out.println("Bạn xếp loại trung bình !");
        } else if (avg >= 6.5 && avg < 8) {
            System.out.println("Bạn xếp loại khá !");
        } else if (avg >= 8 && avg < 9) {
            System.out.println("Bạn xếp loại giỏi !");
        }else if(avg >= 9){
            System.out.println("Bạn xếp loại xuất sắc !");
        }else {
            System.out.println("Ngoài phạm vi tính toán !");
        }
    }
}
