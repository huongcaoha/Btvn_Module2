//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("enter length of array :");
        int length  = 0 ;
        length = Common.getInputInt(length);
        float[] arr = new float[length];
        for(int  i = 0 ; i < arr.length ; i++){
            System.out.println("Enter index "+i);
            arr[i] = Common.getInputFloat(arr[i]);
        }

        for(float num : arr){
            System.out.println(num);
        }
    }
}