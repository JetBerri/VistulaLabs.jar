package com.example.animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Mammal("Bella", 4, 300.0, "Brown");
        animals[1] = new Bird();
        animals[2] = new Fish("Nemo", "Salt water");
        animals[3] = new Dog("Rex", 3, 25.5, "Golden", "Golden Retriever");
        animals[4] = new Pigeon("Pip", "Rock Dove");
        animals[5] = new Blowfish("Puff", 2, 1.2, "Salt water", "Long spines");

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println();
        animals[0].eat();
        System.out.println(animals[0].getName() + " says: " + animals[0].getVoice());

        animals[1].setName("Tweety");
        animals[1].setAge(1);
        ((Bird) animals[1]).setFeatherColor("Yellow");
        ((Bird) animals[1]).fly();
        System.out.println(animals[1]);

        ((Fish) animals[2]).swim();

        animals[3].eat();
        System.out.println(animals[3].getName() + " says: " + animals[3].getVoice());
        ((Dog) animals[3]).fetch();
        ((Dog) animals[3]).feedYoung();

        ((Pigeon) animals[4]).deliverMessage();

        System.out.println(animals[5].getName() + " says: " + animals[5].getVoice());
        ((Blowfish) animals[5]).inflate();

        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Rex", "Golden Retriever");
        behaviors[1] = new Blowfish("Puff", "Long spines");
        behaviors[2] = new Pigeon("Pip", "Rock Dove");

        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();

        for (Animal animal : animals){
            animal.move();
        }

        for (Animal animal : animals){
            AnimalName.name(animal.getName());
        }
    }
}
