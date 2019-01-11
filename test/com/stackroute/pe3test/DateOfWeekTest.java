package com.stackroute.pe3test;
import com.stackroute.pe3main.DateOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import static org.junit.Assert.*;

public class DateOfWeekTest {

    DateOfWeek test;

    @Before
    public void setUp() throws Exception {
        test = new DateOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void DateOfWeekSuccess(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String[] result = test.dateOfWeek(c);
        assertEquals(new String[]{"Mon 07/01/2019","Sun 13/01/2019"},result);
    }

    @Test
    public void DateOfWeekFailure(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String[] result = test.dateOfWeek(c);
        assertNotEquals(new String[]{"Tue 07/01/2019","Sun 13/01/2019"},result);
    }

}