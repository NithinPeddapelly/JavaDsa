public class j79_Multiple_Inheritance {
    public static void main(String args[]) {
        Bear balu = new Bear();
        balu.eatsMeat();
        balu.eatsPlants();
    }
}

interface Carnivore {
    void eatsPlants();
}

interface Herbivore {
    void eatsMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatsMeat() {
        System.out.println("Eats fish");
    }

    public void eatsPlants() {
        System.out.println("Eats fruits and Honey");
    }
}