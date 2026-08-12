public class returntypeandparamet2 {
    public static void main(String args[]){

        Colleg college=new Colleg();

        String [] array=college.arr();

        System.out.println(array[0]);
        System.out.println(array[1]);

       

    }

}

class Colleg{

    public String [] arr(){
        String [] arr=new String[2];

        arr[0]="Rutik";
        arr[1]="Ritik";
       return arr;

    }


    }

