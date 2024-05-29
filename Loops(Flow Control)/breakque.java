import java.util.*;

public class breakque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers of your choice & while break after multiple of 10:");
        
        do{
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}
