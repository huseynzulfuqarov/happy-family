package org.example.Course.Module2.Task8.HappyFamily4.model.human;

import java.util.Arrays;
import java.util.Objects;

public abstract class Human {

    static {
        System.out.println("New class is being loaded: Human");
    }

    {
        System.out.println("New object is being created: Human");
    }

    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private Family family;
    private String[][] schedule = new String[0][0];

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.birthYear = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = dateOfBirth;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family newFamily) {
        this.family = newFamily;
    }

    public String[][] getSchedule() {
        return Arrays.copyOf(schedule, schedule.length);
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = Arrays.copyOf(schedule, schedule.length);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Human human)) return false;
        return birthYear == human.birthYear && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, iq);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + birthYear +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize: Human object is being destroyed -> " + this.name + " " + this.surname);
    }
}
