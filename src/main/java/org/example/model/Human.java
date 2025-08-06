package org.example.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule = new String[0][0];

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.birthYear = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthYear = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
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

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return Arrays.copyOf(schedule, schedule.length);
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = Arrays.copyOf(schedule, schedule.length);
    }

    public void greetPet() {
        if (pet == null) {
            System.out.println("You have not a pet");
            return;
        }
        System.out.printf("Hello, %s!\n", pet.getNickname());
    }

    public void describePet() {
        if (pet == null) {
            System.out.println("You have not a pet");
            return;
        }
        System.out.printf("I have a %s, he is %d years old, he is %s.\n", pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    public boolean feedPet(boolean isTimeToFeed) {
        if (pet == null) {
            System.out.println("You have not a pet");
            return false;
        }
        Random rd = new Random();
        int a = rd.nextInt(100);
        if (isTimeToFeed || a < pet.getTrickLevel()) {
            System.out.printf("Hm... I will feed %s. \nPet say: \n", pet.getNickname());
            pet.eat();
            return true;
        } else {
            System.out.printf("I think %s is not hungry.\n", pet.getNickname());
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Human human)) return false;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(birthYear, human.birthYear) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, pet, mother, father, Arrays.deepHashCode(schedule));
    }

    @Override
    public String toString() {
        String motherInfo = (this.mother != null) ? mother.getName() + " " + mother.getSurname() : "null";
        String fatherInfo = (this.father != null) ? father.getName() + " " + father.getSurname() : "null";
        String petInfo = (this.pet != null) ? pet.toString() : "null";
        return "\nHuman ->{" +
                " | Name: " + name +
                " | Surname: " + surname +
                " | DateOfBirth: " + birthYear +
                " | Iq: " + iq +
                " | Mother: " + motherInfo +
                " | Father: " + fatherInfo +
                " | \n\tPet: " + petInfo + "}";
    }
}