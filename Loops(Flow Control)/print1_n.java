import java.util.*;

public class print1_n {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you wany?");
        int n = sc.nextInt();
        System.out.println("_________");

        int counter=1;
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
        sc.close();
    }
}
