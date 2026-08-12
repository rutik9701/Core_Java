public class Abstraction1 {

    public static void main(String args[]){

        Dog d=new Dog();
        d.sound();

        Cat c=new Cat();
        c.sound();

        Animal a=new Dog(); //This will work//
        a.sound();
        // Animal a=new Animal(); // But Not this//
    }
    
}

abstract class  Animal
{
    abstract void sound();

}

class Dog extends Animal{

    void sound(){
        System.out.println("Dogs can Bark");
    }
}

class Cat extends Animal{
    void sound(){
       System.out.println("Cats can do Meow");
     }
}
