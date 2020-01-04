package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution486Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("PredictTheWinner");
        Solution486 instance = new Solution486();

        assertEquals(false, instance.PredictTheWinner(new int[] {1, 5, 2}));
        assertEquals(true, instance.PredictTheWinner(new int[] {1, 5, 233, 7}));
    }
}
