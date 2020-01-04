package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1192Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numPrimeArrangements");
        SolutionA1192 instance = new SolutionA1192();
        assertEquals("Saturday", instance.dayOfTheWeek(31, 8, 2019));
        assertEquals("Sunday", instance.dayOfTheWeek(18, 7, 1999));
        assertEquals("Sunday", instance.dayOfTheWeek(15, 8, 1993));
    }
}
