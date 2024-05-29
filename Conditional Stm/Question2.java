import java.util.*;

public class Question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature: ");
        float temp = sc.nextFloat();

        if(temp>100){
            System.out.println("You have fewer");
        }
        else{
            System.out.println("You don't have fewer");
        }
        sc.close();
    }
}
