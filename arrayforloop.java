public class arrayforloop{
    public static void main(String args[]){
        int [] arr=new int[5000];

        for(int i=0;i<=4999;i++){
            arr[i]=i;
        }

        System.out.println(arr[4999]);
    }
}