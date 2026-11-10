package com.example.animals;

public interface AnimalMove {
    default void move(){
        System.out.println(getClass().getSimpleName() + " moves in some way.");
    }
}
