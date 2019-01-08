import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks test;

    @org.junit.Before
    public void setUp() throws Exception {
        test = new StudentMarks();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void checkGradeSuccess(){
        String result = test.checkGrade(new int[]{23,44,100,38,86});
        assertEquals("Marks are in range 0-100.",result);
    }

    @Test
    public void checkGradeFailure(){
        String result = test.checkGrade(new int[]{44,54,200,38});
        assertEquals("Error!",result);
    }

    @Test
    public void checkForNull(){
        String result = test.checkGrade(new int[]{});
        assertNull(null,result);
    }
}