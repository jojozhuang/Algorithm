package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution396;

public class Solution396Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxRotateFunction");
        Solution396 instance = new Solution396();

        assertEquals(26, instance.maxRotateFunction(new int[] {4, 3, 2, 6}));
    }
}
