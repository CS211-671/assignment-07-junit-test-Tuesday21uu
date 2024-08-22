package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testAddAndFindStudent()
    {
        StudentList sl = new StudentList();
        sl.addNewStudent("111", "A");
        Student s = sl.findStudentById("111");
        assertEquals("A", s.getName());
    }

    @Test
    void testGiveScoreToId()
    {
        StudentList sl = new StudentList();
        sl.addNewStudent("111", "A", 0);
        Student s = sl.findStudentById("111");
        sl.giveScoreToId("111", 69);
        assertEquals(69, s.getScore());
    }

    @Test
    void testViewGradeOfId()
    {
        StudentList sl = new StudentList();
        sl.addNewStudent("111", "A", 69);
        Student s = sl.findStudentById("111");
        sl.viewGradeOfId("111");
        assertEquals("C", s.grade());
    }
}