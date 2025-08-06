package org.example.processController;

import org.example.model.Human;
import org.example.model.Pet;

public class HappyFamilyApp {

    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.setSpecies("dog");
        pet1.setNickname("Rex");
        pet1.setAge(3);
        pet1.setTrickLevel(45);
        pet1.setHabits(new String[]{"bark", "run"});

        Pet misty = new Pet("Misty", "cat");
        Pet coco = new Pet("Coco", "parrot", 2, 60, new String[]{"talk", "fly"});

        Human human1 = new Human();
        human1.setName("Lara");
        human1.setSurname("Green");
        human1.setBirthYear(1959);
        human1.setIq(90);
        human1.setPet(pet1);
        human1.setMother(null);
        human1.setFather(null);
        human1.setSchedule(new String[][]{
                {"Monday", "gardening"},
                {"Tuesday", "knitting"},
                {"Wednesday", "watch classic movies"},
                {"Thursday", "visit friends"},
                {"Friday", "bake cookies"}
        });

        Human human2 = new Human();
        human2.setName("Sophia");
        human2.setSurname("Green");
        human2.setBirthYear(1960);
        human2.setIq(70);
        human2.setMother(null);
        human2.setFather(null);
        human2.setPet(misty);
        human2.setSchedule(new String[][]{
                {"Thursday", "practice piano"},
                {"Saturday", "go hiking"}
        });

        Human human3 = new Human(
                "David",
                "Green",
                2000,
                80,
                coco,
                human2,
                human1,
                new String[][]{
                        {"Wednesday", "go swimming"},
                        {"Friday", "watch movie"}
                }
        );

        Human michael = new Human("Michael", "Doe", 2000);
        Human anna = new Human("Anna", "Doe", 2001);
        Human john = new Human("John", "Doe", 2022, michael, anna);
        Human emma = new Human("Emma", "Doe", 2024, michael, anna);

        System.out.println("\n============ Demonstrating toString() Output for All Family Members ============");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(anna);
        System.out.println(john);
        System.out.println(michael);
        System.out.println(emma);
        System.out.println("==============================================================================\n");

        System.out.println("============ Demonstrating All Methods for a Child (David) and his Pet (Coco) ============");
        System.out.println("\n--- Child's Interactions ---");
        human3.greetPet();
        human3.describePet();

        System.out.println("\n--- Pet's Behaviors ---");
        human3.getPet().respond();
        human3.getPet().eat();
        human3.getPet().foul();

        System.out.println("\n--- Testing the feedPet() Method ---");
        human3.feedPet(false);
        human3.feedPet(true);

        System.out.println("===========================================================================================");
    }
}
