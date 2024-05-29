public class LinearSearch {
    public static int func(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={12,16,14,18,19,10,21,57,43};
        int key=10;
        int index=func(numbers,key);

        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at : "+index);
        }

    }
}
