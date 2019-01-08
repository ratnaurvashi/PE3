import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels test;

    @Before
    public void setUp() throws Exception {
        test = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void removeVowelsSuccess(){
        List<String> result = new ArrayList<>();
        result.add("India");
        result.add("United States");
        result.add("Germany");
        result.add("Egypt");
        result.add("czechoslovakia");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Ind");
        expectedList.add("Untd Stts");
        expectedList.add("Grmny");
        expectedList.add("Egypt");
        expectedList.add("czchslvk");

        assertEquals(expectedList,test.removeVowel(result));
    }

    @Test
    public void removeVowelsFailure(){
        List<String> result = new ArrayList<>();
        result.add("India");
        result.add("United States");
        result.add("Germany");
        result.add("Egypt");
        result.add("czechoslovakia");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("India");
        expectedList.add("United States");
        expectedList.add("Germany");
        expectedList.add("Egypt");
        expectedList.add("czechoslovakia");

        assertNotEquals(expectedList,test.removeVowel(result));
    }

    @Test
    public void removeVowelsForNull(){
        List<String> result = null;

        assertNull(null,test.removeVowel(result));
    }

    @Test
    public void removeVowelsForEmptyList(){
        List<String> result = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        assertEquals(expectedList,test.removeVowel(result));
    }
}