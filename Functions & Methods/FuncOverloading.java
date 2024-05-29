public class FuncOverloading {
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static double sum(double a,double b){
        return a+b;
    }

     public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Sum is:"+sum(2,5));
        System.out.println("Sum is:"+sum(5,2,3));
        System.out.println("Double sum:"+sum(2.3,3.2));
        System.out.println("Float sum:"+sum(2.3f,3.2f));
    }
}
