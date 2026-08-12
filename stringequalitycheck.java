public class stringequalitycheck {
    public static void main(String args[]){

        String a="A";
        String b="B";

        String c=new String("A");

        System.out.println(a==b);
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
    
}
