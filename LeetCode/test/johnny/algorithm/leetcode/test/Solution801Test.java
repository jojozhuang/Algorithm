package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution801;

public class Solution801Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minSwap");
        Solution801 instance = new Solution801();

        assertEquals(1, instance.minSwap(new int[] {1,3,5,4}, new int[] {1,2,3,7}));
    }
}
