public class CheckPrime {
    // public static boolean isPrime(int n){
    //     // boolean isPrime = true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             // isPrime=false;
    //             // break;
    //             return false;
    //         }
    //     }
    //     // return isPrime;
    //     return true;
    // }


        // IMP i should start from 2 only


    public static boolean isPrime(int n){
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

    public static void main(String[] args) {
        System.out.println(isPrime(7));    
    }
        
}

