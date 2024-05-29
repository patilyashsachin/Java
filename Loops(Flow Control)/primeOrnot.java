import java.util.*;

public class primeOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        boolean isPrime = true;

        if(num==2){
            System.out.println("2 is a prime number");
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
             }
            }

        if(isPrime==true){
            System.out.println("Prime number");
            }
        else{
            System.out.println("Not prime number");
            }

        }
        
        sc.close();
    }
}
