public class arraylowvalueinrange{
    public static void main(String args[]){
        int[] arr={10,40,30,45,4};

        int highest=100;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<highest){
                highest=arr[i];
            }
        }
        System.out.println("Lowest value in the array is: "+highest);

    }
}