import java.util.*;

public class Question5 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = sc.nextInt();

    if(year%4==0){
        System.out.println("This is a leap year");
    }
    else{
        System.out.println("This is not a leap year");
    }
    sc.close();
   } 
}
