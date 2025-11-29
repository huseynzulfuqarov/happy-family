package org.example.Course.Module2.Task8.HappyFamily4.model.pet;

import org.example.Course.Module2.Task8.HappyFamily4.enums.Species;
import org.example.Course.Module2.Task8.HappyFamily4.service.Foulable;

public class DomesticCat extends Pet implements Foulable {

    public DomesticCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.DOMESTIC_CAT);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.DOMESTIC_CAT);
    }

    public DomesticCat() {
        super.setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s %s. I miss you!\n", Species.ROBOCAT, super.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I am a domestic cat. I need to cover it up.");
    }

    @Override
    public String toString() {
        return "domesticCat{" + super.toString() + "}";
    }
}
