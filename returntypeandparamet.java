public class returntypeandparamet{

    public static void main(String args[]){

        Office office=new Office();
        String name=office.name();
        int num=office.num();
        double salary=office.Salary();


        System.out.println("Name  : "+name);
        System.out.println("Rank  : "+num);
        System.out.println("Average Salary  : "+salary);
    }
}

class Office
{
    public String name()
    {
        return "infotech";

    }
    public int num(){
        return 6;
    }

    public double Salary(){

        return  35000.00;
    }

}