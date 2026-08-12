public class findlowinarray {
    public static void main(String args[]){
          int[] arr= {134980,67808790,542986578,1123009768,899987654};
       int highest=2147483647;
       
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]<highest)
           {
               highest=arr[i];
           }
       }
       
       System.out.println(highest);
   }
}
