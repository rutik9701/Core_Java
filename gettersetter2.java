public class gettersetter2 {

     public static void main(String[] args) {
       
       /*
        * Setters and Getters
        *
        */
       
       Instagram first=new Instagram();
       
       
       first.setMobile("9098008877");
       
       
       System.out.println(first.mobile);
       
       
   }

}

class Instagram
{
   String username;
   String mobile;
   
   /*
    * setter Method.
    * VOID.
    * setMobile
    * setUsername
    */
   
   public void setMobile(String num)
   {
       
       if(num.length()==10)
       {
           this.mobile=num;
       }
       else
       {
           this.mobile="invalid number";
       }
   }
    
}
