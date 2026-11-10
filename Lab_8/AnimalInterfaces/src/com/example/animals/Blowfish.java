package com.example.animals;

public class Blowfish extends Fish implements AnimalBehavior {

    private String spineType;

    public Blowfish() {
        super();
        this.spineType = "Unknown";
    }

    public Blowfish(String name, String spineType) {
        super(name, "Unknown");
        this.spineType = spineType;
    }

    public Blowfish(String name, int age, double weight, String waterType, String spineType) {
        super(name, age, weight, waterType);
        this.spineType = spineType;
    }

    public String getSpineType() { return spineType; }
    public void setSpineType(String spineType) { this.spineType = spineType; }

    @Override
    public void eat() {
        System.out.println(getName() + " crushes shellfish with its beak.");
    }

    @Override
    public String getVoice() {
        return "Pop";
    }

    public void inflate() {
        System.out.println(getName() + " inflates into a spiky ball.");
    }

    @Override
    public String toString() {
        return "Blowfish{spineType='" + spineType + "', " + super.toString() + "}";
    }

    @Override
    public void sleep(){
        System.out.println(getName() + " sleeps floating.");
    }

    @Override
    public void move(){
        System.out.println("Blowfish swims.");
    }

}
