public class jionstring {

    public static void main(String args[]){
    
        String[] arr=new String[3]; 
         arr[0]="How";
         arr[1]="are";
         arr[2]="You";

         String s2=String.join("_",arr[0],arr[1],arr[2]);

         System.out.println(s2);

}
}