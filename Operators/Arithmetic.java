public class Arithmetic{
    public static void main(String args[])
    {
        //Binary
        int a=10;
        int b=5;
        int c=a+b;
        System.out.println("Addition: "+c);
        System.out.println("Substraction: "+(a-b));

        System.out.println("Multiplication: "+(a*b));

        System.out.println("Division: "+(a/b));

        System.out.println("Modulus(remainder): "+(a%b));

        //Unary

        // int x=20;
        // int y=x++;
        // System.out.println(x+" "+y);

        // int x=20;
        // int y=x--;
        // System.out.println(x+" "+y);

        // int x=20;
        // int y=++x;
        // System.out.println(x+" "+y);

        int x=20;
        int y=--x;
        System.out.println(x+" "+y);
    }
}