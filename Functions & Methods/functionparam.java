// public class functionparam {
//     public static int sum(int a, int b){
//         int sum=a+b;
//         System.out.println(sum);
//         return sum;
//     }
//     public static void main(String[] args) {
//         sum(5,2);
//     }
// }

import java.util.*;
public class functionparam{
    public static int add(int num1, int num2){
        int sum = num1+num2;
        System.out.println("Sum is:"+sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
        sc.close();
    }
}