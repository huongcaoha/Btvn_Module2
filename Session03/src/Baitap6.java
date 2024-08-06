public class Baitap6 {
    public static void main(String[] args) {
        System.out.println("Enter number row in arr ");
        int row = 0 ;
        row = Common.getInputInt(row);

        System.out.println("Enter number column in arr ");
        int column = 0 ;
        column = Common.getInputInt(column);
        float[][] arr = new float[row][column];

        for(int i  = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.println("Enter value of row " + i + " column " + j);
                arr[i][j] = Common.getInputFloat(arr[i][j]);
            }
        }

        int inputColumn = 0 ;
        System.out.println("Enter column number to calculater sum ");
        inputColumn = Common.getInputInt(inputColumn)-1;

        float sum = 0 ;
        if(inputColumn >= column){
            System.out.println("column input  not found !");
        }else {
            for(int i = 0 ; i < arr.length ; i++){
                sum+= arr[i][inputColumn];
            }
        }

        System.out.println("Array after insert is :");
        for(float[] number : arr){
            for(float num : number){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of column " + inputColumn+1 + " : " + sum);
    }
}
