import java.util.Scanner;
public class missinginarrayfind {
    public static void  main(String args[]){

       
       Scanner scan=new Scanner(System.in);
       
       System.out.println("enter the rows:");

        int rows=scan.nextInt();
        int[][] arr=new int[rows][];
       
       
        for(int i=0;i<rows;i++)
        {
            System.out.println("please enter the column for row: "+ i);
            int columns=scan.nextInt();
            arr[i]=new int[columns];
        }
       
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("row :"+ i +"column :"+j);
                arr[i][j]=scan.nextInt();
            }
        }
       
       
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                // System.out.println("row :"+ i +"column :"+j);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
   }

}