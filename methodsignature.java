public class methodsignature {


    public static void main(String args[]){

        Calculator first=new Calculator();

              int Add=first.add(10,20); 
              System.out.println("The ADDITION IS : "+Add);

              int Sub=first.sub(13,21); 
              System.out.println("The SUBTRACTION IS : "+Sub);

              int Multi=first.mult(10,20); 
              System.out.println("The MULTIPLICATION IS : "+Multi);

              Double Div=first.divi(14.2,19.7); 
              System.out.println("The DIVISION IS : "+Div);


    }
    
}

class Calculator{
    
    public int add( int a,int b){
        return a+b;

    }

    public int sub(int a,int b){
        return a-b;
        
    }

    public int mult(int a,int b){
        return a*b;
    }

    public Double divi(Double a,Double b){
        return a/b;
    }
     
}
