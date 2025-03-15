package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (Animal animal : animals) {
            animalSound(animal);
        }
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }
}
