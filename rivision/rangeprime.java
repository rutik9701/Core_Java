public class rangeprime{

    public static void main(String args[]){
        int counter=0;
         for (int i=2;i<100;i++){
        boolean num=true;

        for(int j=2;j<i;j++){

            if(i%j==0){
                num=false;
                break;
          }          
        }
        
        if(num==true){
                System.out.println("Prime Num: "+i);
                counter++;
            }
            else{
                System.out.println("Non Prime Num: "+i);
            }


         }
         System.out.println(" ");

    }
}