package org.example.Course.Module2.Task8.HappyFamily4.model.pet;

import org.example.Course.Module2.Task8.HappyFamily4.enums.Species;

public class Fish extends Pet {

    public Fish(String nickname) {
        super(nickname);
        super.setSpecies(Species.FISH);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.FISH);
    }

    public Fish() {
        super.setSpecies(Species.FISH);
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s %s. I miss you!\n", Species.FISH, super.getNickname());
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + "}";
    }
}
