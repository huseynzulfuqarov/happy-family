package org.example.Course.Module2.Task8.HappyFamily4.enums;

public enum Species {
    DOG(false, 4, true),
    ROBOCAT(false, 4, true),
    DOMESTIC_CAT(false, 4, true),
    PARROT(true, 2, false),
    FISH(false, 0, false),
    UNKNOWN(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean canFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasFur() {
        return hasFur;
    }
}