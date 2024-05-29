import java.util.*;

public class IOU {
    public static void main(String[] args) {
        int marks[] = new int [100];
        System.out.println("Enter your PCM marks:");
        Scanner sc =new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Phy: "+marks[0]);
        System.out.println("Chem: "+marks[1]);
        System.out.println("Maths: "+marks[2]);

        //Updated marks
        marks[1]=97;
        marks[2]=marks[2]+1;
        System.out.println("Chem: "+marks[1]);
        System.out.println("Math: "+marks[2]);

        int per=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage: "+per+"%");

        //Length of array
        System.out.println("Length of array: "+marks.length);
        sc.close();
    }
}
