package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution774Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minmaxGasDist");
        Solution774 instance = new Solution774();

        assertEquals(0.500000, instance.minmaxGasDist(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9),0.001);
    }
}
