// public class Nestedloop{
//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted star pattern

public class Nestedloop{
    public static void main(String args[]){
        //n=4
        for(int line=1; line<=4; line++){
            for(int star=1;star<=4-line+1;star++){ // n-i+1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}