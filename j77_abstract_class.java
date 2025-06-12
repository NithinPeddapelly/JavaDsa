public class j77_abstract_class {
    public static void main (String args[]){
    
        // Horse H = new Horse();
        // H.eats();
        // H.walk();
        // Chicken c = new Chicken();
        // c.eats();
        // c.walk();
        // System.out.println(H.color);
        // System.out.println(c.color);
        // c.changeColor();
        // H.changeColor();
        
        Mustang ford = new Mustang(); // Animal-> Horse-> Mustang 
        // My.eats();
        // My.walk();
    }
}
abstract class Animal{  // abstract class - can have abstract methods - cannot create class objects - can create constructor
    String color;
    Animal(){
        System.out.println("Animal constructor called");
        color = "Brown"; //By default it makes the color of the animal brown until we change it using changeColor method.
    }
    void eats(){
        System.out.println("eats"); 
    }
    abstract void walk();  // only gives the method definition - idea of method
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "White"; //
        System.out.println(color);
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "orange";
        System.out.println(color);
    }
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}
