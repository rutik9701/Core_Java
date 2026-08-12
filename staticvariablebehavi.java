public class staticvariablebehavi {

    public static void main(String args[]){

        garden first=new garden();

        

        garden sec=new garden();

        sec.flower="yellow";

System.out.println(first.flower);
System.out.println(sec.flower);


    }
    
}

class garden{

    String flower="Red";


}
