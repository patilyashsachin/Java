import java.util.*;

public class else_if {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You're adult");
        }
        else if(age>=13 && age<18){
            System.out.println("You're are teenager");
        }
        else{
            System.out.println("You're child");
        }

        sc.close();
    }
}
