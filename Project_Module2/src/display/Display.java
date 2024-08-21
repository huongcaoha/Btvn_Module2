package display;

public class Display {
    // Định nghĩa các mã ANSI escape codes cho các màu chữ
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_YELLOW = "\\u001B[33m";
    public static final String ANSI_MAGENTA = "\\u001B[35m";
    public static final String ANSI_CYAN = "\\u001B[36m";
//    public static final String ANSI_BROWN = "\\u001B[38;5;94m";
//    public static final String ANSI_ORANGE = "\\u001B[38;5;208m";
//    public static final String ANSI_VIOLET = "\\u001B[38;5;135m";
//    public static final String ANSI_PINK = "\\u001B[38;5;205m";
    public static final String ANSI_GRAY = "\\u001B[37m";



    public static void login(){
        System.out.println(ANSI_BLUE +"_______________________________________________________________________________________________________ ");
        System.out.println("|                                                                                                                                                                                                               |");
        System.out.println("|                                                _______________           ______________             _______________                                               |");
        System.out.println("|                                               |                              |         |                            |           |                              |                                              |");
        System.out.println("|                                               |  "+ANSI_GREEN+"Đăng Nhập"+ANSI_BLUE+"       |         |   "+ANSI_RED+"Đăng Ký"+ANSI_BLUE+"    |           |   "+"\u001B[36m"+"Hot Line"+ANSI_BLUE+"    |           |");
        System.out.println("|                                               |_______________|         |______________|           |_______________|                                                |");
        System.out.println("|                                                                                                                                                                                                               |");
        System.out.println("|_______________________________________________________________________________________________________|");

    }
}
