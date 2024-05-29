
public class LargestNum {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;//+infinity

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest numbers is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,6,5,2,3,8,9};
        System.out.println("Largest value is: "+getlargest(numbers));
    }
}
