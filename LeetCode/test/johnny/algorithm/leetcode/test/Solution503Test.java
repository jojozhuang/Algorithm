package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution503;

public class Solution503Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nextGreaterElements");
        Solution503 instance = new Solution503();

        assertArrayEquals(new int[] {2,-1,2}, instance.nextGreaterElements(new int[] {1,2,1}));
    }
}
