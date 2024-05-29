public class Binary {
    public static int func(int numbers[], int key){
        int start=0, end=numbers.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,5,8,13,16,19,23,27,30};
        int key=30;

        System.out.println("Key is at location: "+func(numbers, key));
    }
}
