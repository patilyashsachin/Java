// public class Halfpy {
//     public static void main(String[] args) {
//         int n=4;
//         for(int line=1;line<=4;line++){
//             for(int num=1;num<=line;num++){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
//     }
// }


//Half Inverted pyramid

public class Halfpy{
    public static void main(String[] args) {
        int n=4;
        for(int line=1;line<=n;line++){
            for(int num=1;num<=(n-line+1);num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
