public class MultiInheritInterface {
public static void main(String args[]){
C c=new C();
c.methodA();
c.methodB();
    
}
}

interface A{

    void methodA();
}
interface B{

    void methodB();
}

class C implements A,B{

   public void methodA(){
        System.out.println("Method A");
    }
    public void methodB(){
        System.out.println("Method B");
    }
}