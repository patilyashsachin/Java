public class ternaryopr {
    public static void main(String args[]){
        int larger = 10>6? 10:6;
        System.out.println("Larger value: "+larger);

        int num=5;
        String large = (num%2==0)? "even" : "odd";
        System.out.println(large);

        int marks=3;
        String status = marks>=33?"Pass":"Fail";
        System.out.println(status);
    }
}