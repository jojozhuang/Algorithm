package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution168Test extends JunitBase {

    @Test
    public void testConvertToTitle() {
        System.out.println("convertToTitle");
        Solution168 instance = new Solution168();

        assertEquals("", instance.convertToTitle(0));
        assertEquals("A", instance.convertToTitle(1));
        assertEquals("Y", instance.convertToTitle(25));
        assertEquals("Z", instance.convertToTitle(26));
        assertEquals("AA", instance.convertToTitle(27));
        assertEquals("AZ", instance.convertToTitle(52));
        assertEquals("AAE", instance.convertToTitle(707));
    }
}
