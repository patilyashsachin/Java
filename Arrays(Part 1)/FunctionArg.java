public class FunctionArg {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        int marks[]={95, 92, 96};
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }
}
