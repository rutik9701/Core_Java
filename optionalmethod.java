

import java.util.Optional;

public class optionalmethod {

   public static void main(String[] args) throws Exception {
   
       /*
        * Optional<T>=>NPE.
        *
        * .of()
        * .ofNullable()
        * .empty()
        *
        */
       
       Optional <String> ops=Optional.ofNullable(null);
       
       
        if(!ops.isPresent())
        {
            System.out.println("no value present");
        }
       else
       {
           System.out.println(ops.get());
        }
       
        System.out.println(ops);
        
        System.out.println(ops.get().toLowerCase());
        
       
       
       
        ops.ifPresent((i)->{
            System.out.println("value is:"+i);
        });
       
       
       ops.ifPresentOrElse((i)->{System.out.println("value is:"+i);}, ()->{System.out.println("THE END");});
       
       
    Optional<Integer> op=op.filter((i)->(i>400));
    
    
    //System.out.println(op);
    
    if(op.isEmpty())
    {
        System.out.println("condition failed");
    }
    else    
    {
        System.out.println(op.get());
   }
   
   
       
    Optional<Integer> op1=ops.map((i)->(i.length()));
    
    
    System.out.println(op1);
    
   System.out.println(op1.get());
       
       
        
         Optional<String>o=ops.or(()->{return Optional.of("demo value");});
        
        
        System.out.println(o.get());
       
       
        String s=ops.orElse("chukal re");
       
        System.out.println(s);
       
       
       System.out.println( ops.orElseThrow());
       
       
       
       
   // System.out.println(ops.orElseThrow(()->(new Exception("value de re baba!"))));
       
       
   }
}