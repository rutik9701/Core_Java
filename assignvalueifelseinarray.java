public class assignvalueifelseinarray {

    public static void main(String args[]){
        int [] array=new int[50];

        for(int i=0;i<50;i++){

            if (i%2==0){
                array [i]=2;
            }
            else{
                array [i]=1;
            }
            System.out.println("Value : " + array[i]);
        }
        
    }
    
}
