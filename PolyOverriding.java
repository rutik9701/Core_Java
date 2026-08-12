public class PolyOverriding{

    public static void main(String args[]){

        UPI u=new UPI();
        u.pay();
       

        BT bt=new BT();
        bt.pay();





        
    }
}

class Payment{
    void pay(){
        System.out.println("Payment Modes");
    }
}
class UPI extends Payment{
    void pay(){
        System.out.println("Pay Using UPI");
    }

}

class BT{
    void pay(){
        System.out.println("Pay Using Bank");
    }
}