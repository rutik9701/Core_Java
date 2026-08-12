public class findlowinarray2 {

    public static void main(String args[]){
          int[] arr= {-2,-3,-1,-5,-6};
       int lowest=-2147483648;
       
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>lowest)
           {
               lowest=arr[i];
           }
       }
       
       System.out.println(lowest);
   }
    
}
