import java.util.*;

public class largestof2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = sc.nextInt();
        System.out.println("Enter number B: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is largest of B");
        }
        else{
            System.out.println("B is largest of A");
        }

        sc.close();
    }
}
