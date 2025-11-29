package org.example.Course.Module2.Task8.HappyFamily4.model.pet;

import org.example.Course.Module2.Task8.HappyFamily4.enums.Species;
import org.example.Course.Module2.Task8.HappyFamily4.service.Foulable;

public class Dog extends Pet implements Foulable {

    public Dog(String nickname) {
        super(nickname);
        super.setSpecies(Species.DOG);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.DOG);
    }

    public Dog() {
        super.setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s %s. I miss you!\n", Species.DOG, super.getNickname());
    }

    public void foul() {
        System.out.println("I am a dog. I need to cover it up.");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "}";
    }
}
