public class constructorinjava {
    public static void main(String[] args) {
       
/*
* 2
* int , String
* int -> String
*/
       School one=new School(178,"DPS");
       
       
       School second=new School(180,"MEX");
       
       
       System.out.println(one.strength+" "+one.name);
       
       
       System.out.println(second.strength+" "+second.name);
       
       //System.out.println();
               
               
   }

}

class School
{
   int strength;
   String name;
   
   public School(int s, String n)
   {
       this.strength=s;
       this.name=n;
   }
}
    
    
    

    

