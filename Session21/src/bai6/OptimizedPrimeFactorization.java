package bai6;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        System.out.println(2);
        int tmp = 3 ;
        while (tmp <= 500){
            boolean check = true ;
            for(int i = 3 ; i <= Math.sqrt(tmp) ; i+= 2){
                if(tmp % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(tmp);
            }
            tmp+= 2 ;
        }
    }
}
