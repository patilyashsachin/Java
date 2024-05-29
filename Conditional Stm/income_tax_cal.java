import java.util.*;

public class income_tax_cal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        
        if(income < 500000){
            float tax = 0 * income;
            System.out.println("You've to pay "  + tax + " Rs tax");
        }
        else if(income>500000 && income < 1000000){
            float tax = 0.2f *income;
            System.out.println("You've to pay " +tax+ " RS tax");
        }
        else{
            float tax = 0.3f * income;
            System.out.println("You've to pay "+tax+" Rs tax");
        }

        //OR
        // System.out.println("You've to pay "+  tax + " Rs tax" );

        sc.close();
    }
}
