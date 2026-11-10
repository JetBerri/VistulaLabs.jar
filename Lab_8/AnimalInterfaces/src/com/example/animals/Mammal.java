package com.example.animals;

public class Mammal extends Animal {

    private String furColor;

    public Mammal() {
        super();
        this.furColor = "Unknown";
    }

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public void eat() {
        System.out.println(getName() + " eats plants and meat.");
    }

    @Override
    public String getVoice() {
        return "Generic mammal sound";
    }

    public void feedYoung() {
        System.out.println(getName() + " feeds its young with milk.");
    }

    @Override
    public String toString() {
        return "Mammal{furColor='" + furColor + "', " + super.toString() + "}";
    }

}
