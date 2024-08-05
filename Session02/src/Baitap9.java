public class Baitap9 {
    public static void main(String[] args) {
        int choice = 0 ;
        while (choice != 4){
            System.out.println("________________________________________________________________");
            System.out.println("Chương trình tính toán chu vi và diện tích các hình học !");
            System.out.println("Xin mời lựa chọn :");
            System.out.println("1 : Tính chu vi và diện tích hình chữ nhật ");
            System.out.println("2 : Tính chu vi và diện tích hình tam giác ");
            System.out.println("3 : Tính chu vi và diện tích hình tròn ");
            System.out.println("4 : Thoát");
            choice = Common.getInputInt(choice);
            if(choice < 1 && choice > 4){
                choice = Common.getInputInt(choice);
            }
            switch (choice){
                case 1 : {
                    System.out.println("Xin mời nhập chiều dài ");
                    int length = 0 ;
                    length = Common.getInputInt(length);

                    System.out.println("Xin mời nhập chiều rộng ");
                    int width = 0 ;
                    width = Common.getInputInt(width);
                    System.out.println("Chu vi hình chữ nhật =  " + (length+width)*2);
                    System.out.println("Diện tích hình chữ nhật = " + length*width);
                    break;
                }
                case 2 : {
                    System.out.println("Xin mời nhập cạnh A ");
                    int a = 0 ;
                    a = Common.getInputInt(a);

                    System.out.println("Xin mời nhập cạnh B ");
                    int b = 0 ;
                    b = Common.getInputInt(b);

                    System.out.println("Xin mời nhập cạnh C ");
                    int c = 0 ;
                    c = Common.getInputInt(c);

                    System.out.println("Chu vi hình tam giác  = " + (a+b+c));
                    System.out.println("Diện tích hình tam giác = " + (a+b+c)/2);
                    break;
                }
                case 3 : {
                    System.out.println("Xin mời nhập bán kính  ");
                    int radius = 0 ;
                    radius = Common.getInputInt(radius);
                    System.out.println("Chu vi hình tròn = " + (2*Math.PI*radius));
                    System.out.println("Diện tích hình tròn  = " + Math.PI*Math.pow(radius,2));
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
