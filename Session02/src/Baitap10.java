public class Baitap10 {
    public static void main(String[] args) {
        boolean check = false ;
        while (!check){
            System.out.println("Xin mời nhập cạnh A ");
            int a = 0 ;
            a = Common.getInputInt(a);

            System.out.println("Xin mời nhập cạnh B ");
            int b = 0 ;
            b = Common.getInputInt(b);

            System.out.println("Xin mời nhập cạnh C ");
            int c = 0 ;
            c = Common.getInputInt(c);
            if((a+b) > c){
                System.out.println("Chu vi hình tam giác  = " + (a+b+c));
                System.out.println("Diện tích hình tam giác = " + (a+b+c)/2);
                check = true ;
            }else {
                System.out.println("3 cạnh bạn nhập ko thể tạo thành hình tam giác , xin mời nhập lại !");
            }
        }
    }
}
