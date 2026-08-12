public class multipleobj
 {

    public static void main(String args[]){

        cars first=new cars();

           first.Company="Toyota";
           first.Model="Fortuner";
           first.Milage=10;
           first.Price=4400000.0;

            System.out.println("CAR NAME : "+first.Model);
          System.out.println("PRICE : "+first.Price);

        cars second=new cars();
          second.Company="Mahindra";
          second.Model="Thar";
          second.Milage=12;
          second.Price=2200000.0;


          System.out.println("CAR NAME : "+second.Model);
          System.out.println("PRICE : "+second.Price);
         




    }



}

class cars{

     String Company;
     String Model;
     int Milage;
     Double Price;
}