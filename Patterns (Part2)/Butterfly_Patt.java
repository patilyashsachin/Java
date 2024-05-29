public class Butterfly_Patt {
    public static void func(int n){
        for(int i=1;i<=n;i++){
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        func(4);
    }
}
