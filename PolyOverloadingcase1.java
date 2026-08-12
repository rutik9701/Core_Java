public class PolyOverloadingcase1 {
public static void main(String args[]){
Test t=new Test();
t.m1(10);

t.m1('a'); //Automatic promotion if a data type "char" convert into "int"
t.m1(10l);
               //t.m1(10.5);   this will give compile time error  
}

    
}
class Test{
    public void m1(int i){
        System.out.println("Int arg method");
    }
    public void m1(float f){
        System.out.println("Float arg Method");
    }
}