public class ifelsee{
    public static void main(String[] args) {

        int age =23;
        if(age>=18){
            System.out.println("You are elgible for vote");
        }else{
            System.out.println("You are not eligibe for vote");

        }




        int age1 = 19;
        int age2 = 80;

        if (age1>=18 && ++age2<=80){
            System.err.println("You are elgible for vote");
        }
          
        else{
            System.err.println("You are not eligible");
        }





        double marks=751.5;
        if (marks>100.0){
            System.out.println("Please enter valid marks");
       }
        
       else if(marks>=35.0){
            System.out.println("Rutik is pass");
        }
        else{
            System.err.println("Rutik is fail");

          
        }



        

        int mymarks=60;
        if (mymarks>=0 && mymarks<=34){
            System.err.println("Failed");
        }
        else if(mymarks>=35 && mymarks<=100){
            System.out.println("Passed");

        }
        else {
            System.out.println("Enetr valid Marks");
        }
        
        }

    }

















