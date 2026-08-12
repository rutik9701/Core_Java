public class checkdiagonalmatrix {

    public static void main(String[] args) {

        int[][] arr=new int[3][3];
        int counter=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
          if(i==j)
          {

            arr[i][j]=counter;
            counter++;
          }
                
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.err.println("                        ");

     boolean zero_check=true;
     boolean non_zero_check=true;

     for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    if(arr[i][j]==0){
                        non_zero_check=false;

                    }
                    
                    
                }
                else{
                    if(arr[i][j] !=0){
                        zero_check=false;
                    }
                }

            }
        }

        if(non_zero_check && zero_check){
            System.err.println("This is Diagonal Matrix");
        }
        else{
            System.err.println("This is NOT Diagonal Matrix");
        }
}}


