import java.util.*;

public class Question3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter price of pencil: ");
        int pencil = sc.nextInt();
        System.out.println("Enter price of pen: ");
        int pen = sc.nextInt();
        System.out.println("Enter price of eraser: ");
        int eraser = sc.nextInt();
        int total=pencil+pen+eraser;
        System.out.println("Total price is:"+total);

        float gst = total+(total*0.18f);
        System.out.println("Price with 18% GST is:"+gst);
    }
}
