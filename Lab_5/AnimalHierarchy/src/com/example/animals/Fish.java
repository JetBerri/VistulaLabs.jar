package com.example.animals;

public class Fish extends Animal {

    private String waterType;

    public Fish() {
        super();
        this.waterType = "Unknown";
    }

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public void eat() {
        System.out.println(getName() + " eats plankton.");
    }

    @Override
    public String getVoice() {
        return "Blub";
    }

    public void swim() {
        System.out.println(getName() + " swims through the water.");
    }

    @Override
    public String toString() {
        return "Fish{waterType='" + waterType + "', " + super.toString() + "}";
    }

}
