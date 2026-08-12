public class diffreturndatatypes {

    public static void main(String args[]){

        name Name=new name();


       String nam= Name.school();
       System.out.println(nam);

       int namee=Name.sch();
       System.out.println(namee);

       double namm=Name.me();
       System.out.println(namm);





    }
    
}

class name{

    public String school(){
        return "Rutik";
    }


    public int sch(){
        return 100;
    }

    public double me(){
        return 100.00;
    }


}
