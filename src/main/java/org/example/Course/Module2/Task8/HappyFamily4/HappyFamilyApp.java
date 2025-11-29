package org.example.Course.Module2.Task8.HappyFamily4;

import org.example.Course.Module2.Task8.HappyFamily4.enums.DayOfWeek;
import org.example.Course.Module2.Task8.HappyFamily4.model.human.Family;
import org.example.Course.Module2.Task8.HappyFamily4.model.human.Human;
import org.example.Course.Module2.Task8.HappyFamily4.model.human.Man;
import org.example.Course.Module2.Task8.HappyFamily4.model.human.Woman;
import org.example.Course.Module2.Task8.HappyFamily4.model.pet.Dog;
import org.example.Course.Module2.Task8.HappyFamily4.model.pet.DomesticCat;
import org.example.Course.Module2.Task8.HappyFamily4.model.pet.Fish;
import org.example.Course.Module2.Task8.HappyFamily4.service.Foulable;

public class HappyFamilyApp {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setNickname("Rex");
        dog1.setAge(3);
        dog1.setTrickLevel(45);
        dog1.setHabits(new String[]{"bark", "run"});

        DomesticCat misty = new DomesticCat("Misty");
        Fish coco = new Fish("Coco", 1, 30, new String[]{"swim", "jump"});

        Man michael = new Man("Michael", "Doe", 2000, 90, new String[0][0]);
        Woman anna = new Woman("Anna", "Doe", 2001, 80, new String[0][0]);
        Man john = new Man("John", "Doe", 2022);
        Woman emma = new Woman("Emma", "Doe", 2024);

        Woman lara = new Woman("Lara", "Green", 1959, 90, new String[][]{
                {DayOfWeek.MONDAY.name(), "gardening"},
                {DayOfWeek.THURSDAY.name(), "knitting"},
                {DayOfWeek.WEDNESDAY.name(), "watch classic movies"},
                {DayOfWeek.THURSDAY.name(), "visit friends"},
                {DayOfWeek.FRIDAY.name(), "bake cookies"}
        });

        Man david = new Man("David", "Green", 1959, 95, new String[][]{
                {DayOfWeek.THURSDAY.name(), "go swimming"},
                {DayOfWeek.FRIDAY.name(), "watch movie"}
        });

        Woman sophia = new Woman("Sophia", "Green", 1995, 70, new String[][]{
                {DayOfWeek.THURSDAY.name(), "practice piano"},
                {DayOfWeek.FRIDAY.name(), "go hiking"}
        });

        Family doeFamily = new Family(michael, anna);
        Family greenFamily = new Family(david, lara);

        doeFamily.setPet(dog1);
        greenFamily.setPet(misty);

        System.out.println("\n=== 1. Human toString() Test ===");
        System.out.println(lara);
        System.out.println(sophia);
        System.out.println(david);
        System.out.println(anna);
        System.out.println(john);
        System.out.println(michael);
        System.out.println(emma);

        System.out.println("\n=== 2. Family toString() Test (Before Children) ===");
        System.out.println(doeFamily);
        System.out.println(greenFamily);

        System.out.println("\n=== 3. Family addChild() Test ===");
        doeFamily.addChild(john);
        doeFamily.addChild(emma);
        greenFamily.addChild(sophia);

        System.out.println("\n=== 4. Family toString() (After Adding Children) ===");
        System.out.println(doeFamily);
        System.out.println(greenFamily);

        System.out.println("\n=== 5. Specific Human Actions Test ===");
        michael.repairCar();
        anna.makeup();

        System.out.println("\n=== 6. Family deleteChild(Human child) Test ===");
        if (greenFamily.deleteChild(sophia)) {
            System.out.println("Sophia was removed from greenFamily.");
        } else {
            System.out.println("Sophia was NOT removed (not found).");
        }

        if (greenFamily.deleteChild(sophia)) {
            System.out.println("Sophia was removed from greenFamily.");
        } else {
            System.out.println("Sophia was NOT removed (not found).");
        }

        System.out.println("\n=== 7. Family deleteChild(int index) Test ===");
        if (doeFamily.deleteChild(0)) {
            System.out.println("Child at index 0 was removed from doeFamily.");
        } else {
            System.out.println("Child at index 0 was NOT removed.");
        }

        System.out.println("\n=== 8. Family bornChild() Test ===");
        Human newChild = doeFamily.bornChild();
        System.out.println("New child born: " + newChild);

        System.out.println("\n=== 9. Family toString() (After Deleting & Born Child) ===");
        System.out.println(doeFamily);
        System.out.println(greenFamily);

        System.out.println("\n=== 10. Pet Behavior Test ===");
        greenFamily.getPet().respond();
        doeFamily.getPet().eat();
        if (greenFamily.getPet() instanceof Foulable) {
            ((Foulable) greenFamily.getPet()).foul();
        }

        System.out.println("\n=== 11. Family feedPet() Test ===");
        doeFamily.feedPet(false);
        doeFamily.feedPet(true);


        System.out.println("\n---  Garbage Collector ---");
        for (int i = 0; i < 1000000; i++) {
            new Man();
        }
        System.out.println("Loop finished. GC will clean up unreachable objects.");
    }
}
