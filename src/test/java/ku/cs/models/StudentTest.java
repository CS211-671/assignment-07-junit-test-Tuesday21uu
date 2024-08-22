package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest
{
    @BeforeEach
    void init()
    {
        Student s1 = new Student("66xxxxxxxx", "Tues");
    }

    @Test
    void testAddScore()
    {
        Student s1 = new Student("66xxxxxxxx", "Tues");
        s1.addScore(10.5);
        assertEquals(10.5, s1.getScore());
        s1.addScore(50);
        assertEquals(60.5, s1.getScore());
    }

    @Test
    void testCalculate()
    {
        Student s1 = new Student("66xxxxxxxx", "Tues");
        s1.addScore(70);
        assertEquals("B", s1.grade());
    }

    @Test
    void testIsId()
    {
        Student s1 = new Student("66xxxxxxxx", "Tues");
        assertTrue(s1.isId("66xxxxxxxx"));
    }

    @Test
    void testIsId2()
    {
        Student s1 = new Student("66xxxxxxxx", "Tues");
        assertFalse(s1.isId("65xxxxxxxx"));
    }

    @Test
    void testChangeName()
    {
        Student s1 = new Student("66xxxxxxxx", "Tues");
        s1.changeName("Tiew");
        assertEquals("Tiew", s1.getName());
    }

    @Test
    void testToString()
    {
        Student s1 = new Student("66xxxxxxxx", "Tues", 100);
        assertEquals("{id: '66xxxxxxxx', name: 'Tues', score: 100.0}", s1.toString());
    }
}