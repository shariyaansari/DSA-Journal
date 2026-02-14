package OOPS;

public class SuperKeyWord {
    public static void main(String[] args) {
        AnimalS myAnimal = new AnimalS();
        System.out.println(myAnimal.color);
    }
}

class Organims{
    String color;
    Organims(){
        System.out.println("Organism Classs Constructor is called");
    }
}

class AnimalS extends Organims{
    AnimalS(){
        super.color = "AnyColor";
        System.out.println("Animal class Constructor called");
    }
}
