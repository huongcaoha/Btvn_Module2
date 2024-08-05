public class Baitap8 {
    public static void main(String[] args) {
        int choice = 0 ;
        while (choice != 4){
            System.out.println("________________________________________________________________");
            System.out.println("Chương trình tính toán và kiểm tra !");
            System.out.println("Xin mời lựa chọn :");
            System.out.println("1 : Kiểm tra tính chắn lẻ cảu 1 số ");
            System.out.println("2 : Kiểm tra số nguyên tố ");
            System.out.println("3 : Kiểm tra 1 số có chia hết cho 3 hay không ");
            System.out.println("4 : Thoát");
            choice = Common.getInputInt(choice);
            if(choice < 1 && choice > 4){
                choice = Common.getInputInt(choice);
            }
            switch (choice){
                case 1 : {
                    System.out.println("Xin mời nhập 1 số để kiểm tra ");
                    int number = 0 ;
                     number = Common.getInputInt(number);
                     if(number % 2 == 0){
                         System.out.println(number + " là số chẵn !");
                     }else {
                         System.out.println(number + " là số lẻ !");
                     }
                    break;
                }
                case 2 : {
                    System.out.println("Xin mời nhập 1 số để kiểm tra ");
                    int number = 0 ;
                    number = Common.getInputInt(number);
                    if(number < 2){
                        System.out.println(number + " không phải là số nguyên tố !");
                    }else {
                        boolean check = Common.checkPrime(number);
                        if(check){
                            System.out.println(number + " là số nguyên tố !");
                        }else {
                            System.out.println(number + " không phải là số nguyên tố !");
                        }
                    }
                    break;
                }
                case 3 : {
                    System.out.println("Xin mời nhập 1 số để kiểm tra ");
                    int number = 0 ;
                    number = Common.getInputInt(number);
                    if(number % 3 == 0){
                        System.out.println(number + " là số chia hết cho 3 !");
                    }else {
                        System.out.println(number + " là số không chia hết cho 3 !");
                    }
                    break;
                }
                case 4 :{
                    System.out.println("Goodbye !!!");
                    break;
                }
                default: {
                    System.out.println("Xin nhập đúng lựa chọn từ 1  đến 4 !");
                }
            }

        }
    }
}
