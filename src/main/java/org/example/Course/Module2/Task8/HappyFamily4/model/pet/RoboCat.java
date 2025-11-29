package org.example.Course.Module2.Task8.HappyFamily4.model.pet;

import org.example.Course.Module2.Task8.HappyFamily4.enums.Species;

public class RoboCat extends Pet {

    public RoboCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }

    public RoboCat() {
        super.setSpecies(Species.ROBOCAT);
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s %s. I miss you!\n", Species.ROBOCAT, super.getNickname());
    }

    @Override
    public String toString() {
        return "roboCat{" + super.toString() + "}";
    }
}
