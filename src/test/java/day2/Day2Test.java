package day2;

import junit.framework.TestCase;
import org.junit.Test;
import utils.TestUtils;

public class Day2Test extends TestCase {

    @Test
    public void testGetNumberOfInvalidPasswords() {
        int validPasswords = Day2.getNumberOfInvalidPasswordsWithPolicie1(TestUtils.readFileIntoList("day2.txt"));
        assertEquals(536, validPasswords);
    }

    public void testGetNumberOfInvalidPasswordsWithPolicie2() {
        //int validPasswords = Day2.getNumberOfInvalidPasswordsWithPolicie2(TestUtils.readFileIntoList("day2.txt"));
        //assertEquals(536, validPasswords);
    }
}