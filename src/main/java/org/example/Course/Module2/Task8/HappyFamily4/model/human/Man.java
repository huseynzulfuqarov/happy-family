package org.example.Course.Module2.Task8.HappyFamily4.model.human;

public final class Man extends Human {

    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Man(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Man() {
    }

    public void repairCar() {
        System.out.println("Repairing car....");
    }

    @Override
    public String toString() {
        return "Man{" + super.toString() + "}";
    }
}
