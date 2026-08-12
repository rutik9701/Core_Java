
public class InterfaceInAbstarction {

    public static void main(String args[]){

    Dog d = new Dog();

    d.sound ();

    Cat c = new Cat();

    c.sound ();

}
}



interface Animals {

     void sound();
}

class Dog implements Animals {

    public void sound(){
        System.out.println("Dogs can Bark");
    }
}

class Cat implements Animals {

    public void sound(){
        System.out.println("Cats can do Meow");
    }
}
