

//interface assumes all the methods are abstract.
//cannot have ANY implemented methods in an interface.
interface catInterface{
    void meow();
    void eat();
}


//abstract class helps us organize what a cat
//should have. Abstract can both abstract methods as well as already implemented ones in
//an abstract class
abstract class Cat{

    String breed;

    public void  meow(){
        System.out.println("meow");
    }
  //abstract method
   public abstract void eat();
}


class nebelueng extends Cat{
    public void eat(){
        System.out.println("cat is eating");
    }

    //when implementing a class you must include all the methods of the catInterface
    class calico implements catInterface {
        public void meow(){

        }

        public void eat(){

        }
    }
}

public class Main {
    public static void main(String[] args) {

       nebelueng c = new nebelueng();

        c.meow();
        c.eat();


    }
}
