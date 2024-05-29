public class callByValue{
    public static void num(int a,int b){
       
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[]){
        int a=5, b=8;
       
        num(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);

        

    }
}