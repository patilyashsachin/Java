import java.util.*;

public class Question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int A = sc.nextInt();
        System.out.println("Enter number 2:");
        int B = sc.nextInt();
        System.out.println("Enter number 3:");
        int C = sc.nextInt();

        int avg = (A+B+C) / 3;
        System.out.println("Average is: "+avg);
    }
}