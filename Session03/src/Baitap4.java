public class Baitap4 {
    public static void main(String[] args) {
        System.out.println("Enter number row in arr ");
        int row = 0 ;
        row = Common.getInputInt(row);

        System.out.println("Enter number column in arr ");
        int column = 0 ;
        column = Common.getInputInt(column);
        int[][] arr = new int[row][column];
        int numberMax = Integer.MIN_VALUE ;
        for(int i  = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.println("Enter value of row " + i + " column " + j);
                arr[i][j] = Common.getInputInt(arr[i][j]);
                if(arr[i][j] > numberMax){
                    numberMax = arr[i][j];
                }
            }
        }

        System.out.println("Array after insert is :");
        for(int[] number : arr){
            for(int num : number){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Number max : " + numberMax);
    }
}
