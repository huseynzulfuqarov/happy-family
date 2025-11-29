package org.example.Course.Module2.Task8.HappyFamily4;

import org.example.Course.Module2.Task8.HappyFamily4.model.human.Family;
import org.example.Course.Module2.Task8.HappyFamily4.model.human.Human;
import org.example.Course.Module2.Task8.HappyFamily4.model.human.Man;
import org.example.Course.Module2.Task8.HappyFamily4.model.human.Woman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {

    private Family family;
    Human father;
    Human mother;
    Human child1;
    Human child2;

    @BeforeEach
    void setUp() {
        father = new Man("Vito", "Corleone", 1920);
        mother = new Woman("Carmela", "Corleone", 1925);
        family = new Family(father, mother);
        child1 = new Man("Sonny", "Corleone", 1946);
        child2 = new Woman("Michael", "Corleone", 1950);
    }

    @Test
    void testToString() {
        String expectedString = "\nFamily ->{ Father: Vito Corleone | Mother: Carmela Corleone\n\t | Children: []\n\t\t | Pet: null }";
        assertEquals(expectedString, family.toString());
    }

    @Test
    void addChild_shouldIncreaseArraySizeAndAddChild() {
        assertEquals(2, family.countFamily());
        family.addChild(child1);
        assertEquals(3, family.countFamily());
        assertEquals(child1, family.getChildren()[0]);
        assertEquals(family, child1.getFamily());
    }

    @Test
    void deleteChildByObject_shouldDecreaseArraySizeOnSuccess() {
        family.addChild(child1);
        family.addChild(child2);
        assertEquals(4, family.countFamily());

        boolean result = family.deleteChild(child1);

        assertTrue(result);
        assertEquals(3, family.countFamily());
        assertEquals(child2, family.getChildren()[0]);
        assertNull(child1.getFamily());
    }

    @Test
    void deleteChildByObject_shouldNotChangeArrayOnFailure() {
        family.addChild(child1);
        Man stranger = new Man("Fredo", "Corleone", 1948);
        assertEquals(3, family.countFamily());

        boolean result = family.deleteChild(stranger);

        assertFalse(result);
        assertEquals(3, family.countFamily());
    }

    @Test
    void deleteChildByIndex_shouldDecreaseArraySizeOnSuccess() {
        family.addChild(child1);
        assertEquals(3, family.countFamily());

        boolean result = family.deleteChild(0);

        assertTrue(result);
        assertEquals(2, family.countFamily());
        assertEquals(0, family.getChildren().length);
    }

    @Test
    void deleteChildByIndex_shouldNotChangeArrayOnInvalidIndex() {
        family.addChild(child1);
        assertEquals(3, family.countFamily());

        boolean result = family.deleteChild(5);

        assertFalse(result);
        assertEquals(3, family.countFamily());
    }

    @Test
    void countFamily_shouldReturnCorrectMemberCount() {
        assertEquals(2, family.countFamily());
        family.addChild(child1);
        assertEquals(3, family.countFamily());
        family.addChild(child2);
        assertEquals(4, family.countFamily());
    }
}

