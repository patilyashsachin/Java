import java.util.*;

public class sumOnatural {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many natural number do you want?");
        int n = sc.nextInt();
        int counter=1;
        int sum=0;
        while(counter<=n){
            sum = sum+counter;
            counter++;
        }
        System.out.println("________");
        System.out.println(sum);
        sc.close();
    }
}