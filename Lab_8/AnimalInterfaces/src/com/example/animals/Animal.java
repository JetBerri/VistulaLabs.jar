package com.example.animals;

public abstract class Animal implements AnimalMove{

    private String name;
    private int age;
    private double weight;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public abstract void eat();

    public abstract String getVoice();

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }

}
