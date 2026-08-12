public class jaggedarray2 {
    public static void main(String args[]){
        int[][] arr=new int[4][];

        arr[0]=new int[3];
        arr[1]=new int[1];
        arr[2]=new int[2];
        arr[3]=new int[4];

        


        for(int i=0;i<4;i++){
            for(int j=0;j<arr[i].length;j++){

                arr[i][j]=2;
                 System.out.print(" "+ arr[i][j]);

                 

        

           
        }
        System.out.println();

       
    }
}
}
