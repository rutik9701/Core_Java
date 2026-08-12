public class ifelseif {
    public static void main(String[] args) {

        int item =5000;
        if(item>0 && item<=1000){
            System.out.println("You got 15% Discount");
        }
        else if(item>1000 && item<=2000){
            System.out.println("You got 30% Discount");

        }
        else if(item>2000 && item<=3000){
            System.out.println("You got 50% Discount");
        }
        else if(item<=0){
            System.out.println("Puchase something");
        }
        else{
            System.out.println("You got 100% Discount");
        }
    }
}
