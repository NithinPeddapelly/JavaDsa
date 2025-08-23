public class superkeyword {
    public static void main (String args[]){
        Horse badsha = new Horse();

    }
}

class Animal {
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super(); 
        System.out.println("Horse Constructor is called");
    }
}
