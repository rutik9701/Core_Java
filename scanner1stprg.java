import java.util.Scanner;

public class scanner1stprg{

    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age=sc.nextInt();
        

        System.out.println(4*age);

    }
} 