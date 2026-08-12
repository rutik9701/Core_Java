import java.io.*;

public class bufferedreader2 {
    public static void main(String args[]) throws Throwable{
        BufferedReader brr=new BufferedReader(
            new InputStreamReader(System.in));

             System.out.print("Enter Your Name : ");
            String name=brr.readLine();

                System.out.print("Enter Your Age : ");
               int age=Integer.parseInt(brr.readLine());

                   System.out.print("Enter Your Marks : ");
                  float marks=Float.parseFloat(brr.readLine());   

                        System.out.print("Enter Your Percentage : ");  
                       double perc=Double.parseDouble(brr.readLine());


            System.out.println("-------------+------------+");
            System.out.println("Your Name is :       "+name);
            System.out.println("Your Age is :        "+age);
            System.out.println("Your Marks is :      "+marks);
            System.out.println("Your Percentage is : "+perc); 


        

    }

   
}