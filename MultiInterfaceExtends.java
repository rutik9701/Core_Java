public class MultiInterfaceExtends {
    public static void main(String args[]){

      Sounds s=new Sounds();

      s.soundsofanimals();
      s.soundsofdog();


    }
    
}


interface Animalss{

    void soundsofanimals();
}
interface Dogss extends Animalss{

    void soundsofdog();
}
class Sounds implements Dogss{

   public void  soundsofanimals(){
        System.out.println("Sound of Animals");
  
   }

   public void soundsofdog(){
    System.out.println("Sounds oF Dog");
   }
}