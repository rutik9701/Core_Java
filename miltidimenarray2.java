public class miltidimenarray2 {

    public static void main(String[] args) {
          int[][] arr=new int[4][5];
       
       for(int i=0;i<4;i++) //i=0 ,1 ,2 ,3
       {
           for(int j=0;j<5;j++) //0=>0,0 0,1 .. 0,4
           {
               arr[i][j]=i+j;
           }
       }
       
       
       for(int i=0;i<4;i++) //i=0,1,2,3
       {
           for(int j=0;j<5;j++) 
           {
               System.out.print(arr[i][j]+" "); 
           }
           System.out.println(" ");
       }
    }
    
}
