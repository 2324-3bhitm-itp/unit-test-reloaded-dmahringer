package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TeacherTest {
    Teacher teacher;

    @Before
    public void setUp() {
        teacher = new Teacher();
    }

    @Test
    public void given_teacher_then_is_instance_of_person() {
        assertTrue(teacher instanceof Person);
    }

   
}
