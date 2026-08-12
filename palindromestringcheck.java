public class palindromestringcheck {
    public static void main(String args[]){

        String s="dada";
        String t="";

        System.out.println("Input Name : "+s);

        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);

        }
        
        System.out.println("After Checking it : "+ t);
        
        
        if(s.equals(t)==true){
            System.out.println("Result  : Palindrome");
        }
        else{
            System.out.println("Result  : Not a Palindrome");
        }

    }
    
}
