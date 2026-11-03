package com.example.animals;

public class Dog extends Mammal {

    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, String breed) {
        super(name, "Unknown");
        this.breed = breed;
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public void eat() {
        System.out.println(getName() + " eats dog food.");
    }

    @Override
    public String getVoice() {
        return "Woof";
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball.");
    }

    @Override
    public String toString() {
        return "Dog{breed='" + breed + "', " + super.toString() + "}";
    }

}
