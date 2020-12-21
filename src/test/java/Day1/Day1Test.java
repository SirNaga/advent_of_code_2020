package Day1;

import junit.framework.TestCase;
import org.junit.Test;
import utils.TestUtils;

public class Day1Test extends TestCase {

    @Test
    public void testCalculateNumberFor2() {
        int calculatedNumber = Day1.calculateNumberFor2(TestUtils.readFileIntoListInteger("day1.txt"));
        assertEquals(1006875, calculatedNumber);
    }

    public void testCalculateNumberFor3() {
        int calculatedNumber = Day1.calculateNumberFor3(TestUtils.readFileIntoListInteger("day1.txt"));
        assertEquals(165026160, calculatedNumber);
    }
}