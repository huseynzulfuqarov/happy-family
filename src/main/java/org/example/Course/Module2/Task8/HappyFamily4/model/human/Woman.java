package org.example.Course.Module2.Task8.HappyFamily4.model.human;

public final class Woman extends Human {

    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Woman() {
    }

    public void makeup() {
        System.out.println("Making up....");
    }

    @Override
    public String toString() {
        return "Woman{" + super.toString() + "}";
    }
}
