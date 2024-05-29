import java.util.*;

public class largestof3 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number A:");
        int A = sc.nextInt();
        System.out.println("Enter number B:");
        int B = sc.nextInt();
        System.out.println("Enter number C:");
        int C = sc.nextInt();

        if(A>B && A>C){
            System.out.println("A is greater");
        }
        else if(B>C){
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }

        sc.close();
    }
}
