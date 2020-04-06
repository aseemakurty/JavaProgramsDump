public class PrimeNumber {

    //Print first 10 prime numbers
    public static void main(String args[]){
        int i,m=0;
        int number =3;
        int primes =10;
        while(primes>1){
            int flag =0;
            for(i=2;i<=number/2;i++){
                if(number%2==0){
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.println(number);
                primes--;
            }
            number++;
        }
    }
}
