public class Primes{

    public static boolean isPrime(int n){
        boolean isPrime=true;
        
        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean primesinrange(int n){
        for(int i=2;i<=n;i++){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println(primesinrange(20));
    }
}
