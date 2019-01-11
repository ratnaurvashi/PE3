package com.stackroute.pe3test;
import com.stackroute.pe3main.CheckConsecutive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckConsecutiveTest {

    CheckConsecutive test;

    @Before
    public void setUp() throws Exception {
        test = new CheckConsecutive();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void checkConsecutiveSuccess(){
        boolean result1 = test.checkConsecutiveNo("98,96,95,94,93");
        assertEquals(false,result1);

        boolean result2 = test.checkConsecutiveNo("54,53,52,51,50,49,48");
        assertEquals(true,result2);

        boolean result3 = test.checkConsecutiveNo("1,2,3,4,5,6,7");
        assertEquals(true,result3);
    }

    @Test
    public void checkConsecutiveFailure(){
        boolean result1 = test.checkConsecutiveNo("98,96,95,94,93");
        assertNotEquals(true,result1);

        boolean result2 = test.checkConsecutiveNo("54,53,52,51,50,49,48");
        assertNotEquals(false,result2);

        boolean result3 = test.checkConsecutiveNo("1,2,3,4,5,6,7");
        assertNotEquals(false,result3);
    }

    @Test
    public void checkConsecutiveForNull(){
        boolean result1 = test.checkConsecutiveNo(null);
        assertEquals(false,result1);
    }

    @Test
    public void checkConsecutiveForEmptyString(){
        boolean result1 = test.checkConsecutiveNo(" ");
        assertEquals(false,result1);
        boolean result2 = test.checkConsecutiveNo("");
        assertEquals(false,result1);
    }
}