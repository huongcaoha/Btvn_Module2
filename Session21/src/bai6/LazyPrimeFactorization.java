package bai6;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {

        int tmp = 2 ;
        while (tmp <= 500){
            boolean check = true ;
            for(int i = 3 ; i <= Math.sqrt(tmp) ; i++){
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
