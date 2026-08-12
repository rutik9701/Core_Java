import java.util.Scanner;
public class jaggedarraywithscanner {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Rows : ");

        int rows=sc.nextInt();

        int[][] arr=new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.println("Enter The Columns For Row : ");
            int column=sc.nextInt();
            arr[i]=new int[column];

        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }

        }

    }
    
}
