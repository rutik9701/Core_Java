 class myinfo{
        int Id;
        String Name;
        Double Marks;

        
        String result;  // INSTANCE VARIABLE : we can use this variable in below methods
        

        public void infostudy(){
           String grade="A";  //Local Variable : use only in this method
          System.out.println("Student writing a exam paper & "+"Grade : "+grade+"  & Result IS :  "+ result);
         
        }

        public void infstudy(){
          String grade="B"; // LOCAL VARIABLE
          System.out.println("Student writing a exam paper & "+"Grade : "+grade+"  & Result IS :  "+ result);
        }

    }
public class classobject2 {
   
    
    public static void main(String args[]){
      myinfo info=new myinfo();
        info.Id=101;
        info.Name="Rutik";
        info.Marks=95.25;
        info.result="Pass";

        myinfo inf=new myinfo();
        inf.Id=102;
        inf.Name="Mayur";
        inf.Marks=88.5;
        inf.result="Pass";

         myinfo in=new myinfo();
        in.Id=103;
        in.Name="Om";
        in.Marks=98.3;

         myinfo i=new myinfo();
        i.Id=104;
        i.Name="Yash";
        i.Marks=88.0;

         myinfo infoo=new myinfo();
        infoo.Id=105;
        infoo.Name="Rohan";
        infoo.Marks=89.98;

          System.out.println("Student Id : "+info.Id);
        System.out.println("Name : "+info.Name); 
        System.out.println("Marks : "+info.Marks);

             info.infostudy();
             System.out.println();

              System.out.println("Student Id : "+inf.Id);
        System.out.println("Name : "+inf.Name); 
        System.out.println("Marks : "+inf.Marks);
             inf.infstudy();


    }
}
