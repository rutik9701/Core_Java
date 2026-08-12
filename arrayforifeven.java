public class arrayforifeven {
    public static void main(String[] args) {
        
        int[] arr=new int[10];

        for(int i=0;i<=9;i++){

            if(i%2==0){
                arr[i]=50;
            }
            else{
                arr[i]=51;
            }
        }
        System.out.println(arr[7]);
    }
    
}
