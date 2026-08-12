public class staticvariableandmethod {

    public static void main(String args[]){

        Bus.name="hey the "+Bus.name;
        System.out.println(Bus.name);

        

        Bus.start();


    }
    
}

class Bus{

  static  String name="TATA";

      public static void start(){

        System.out.println("Bus Is Starting");
      }
}
