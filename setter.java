public class setter {

    public static void main(String args[]){

        Student first=new Student();
      
            first.setName("Rutik");

    System.out.println(first.getName());

       

         System.out.println(first.Name);




    }
    
}

class Student{

    String Name;
   

    

    

    public void setName(String rutik){

        if(Name.length()>5){

            this.Name=Name;

        }
        else{
            this.Name="Invalid Value";
        }
    }
    public String getName(){
        return this.Name;
    }
}
