public class defaultconstructor {
     public static void main(String[] args) {

       /*
        *
        * Constructors in JAVA.
        *
        */

       
       Aeroplane aero=new Aeroplane("Boeing");// constructor call.
       
       
       
       
       System.out.println(aero.name);
       
       
       
       
   }
}


class Aeroplane
{
   String name;
   
   /*
    *
    * public Aeroplane()
    * {
    *
    * }
    */
   
   /*
    * 0
    * 0 NON PARAM
    * 0
    */
   public Aeroplane(String names)
   {
       this.name=names;
       
       System.out.println("calling constructor....");
   }
    
}
