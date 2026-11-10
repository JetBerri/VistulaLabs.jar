package com.example.animals;

public class Bird extends Animal {

    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public void eat() {
        System.out.println(getName() + " pecks at seeds.");
    }

    @Override
    public String getVoice() {
        return "Tweet";
    }

    public void fly() {
        System.out.println(getName() + " flies through the sky.");
    }

    @Override
    public String toString() {
        return "Bird{featherColor='" + featherColor + "', " + super.toString() + "}";
    }

}
