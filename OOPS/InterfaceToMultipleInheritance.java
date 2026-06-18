package oops;

public class InterfaceToMultipleInheritance {
    public static void main(String[] args) {
        Bear myBear = new Bear();
        myBear.type();
    }
}

interface Herbivore {
    void type();
}
interface Carnivore {
    void type();
}

class Bear implements Herbivore,Carnivore{
    public void type(){
        System.out.println("Bear is both a herbivore and a carnivore (omnivore)");
    }
}
