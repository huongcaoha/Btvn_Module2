package bai13;

public class Main {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }

    public static void main(String[] args) {
        int[] arr = getArr();
    }
}
