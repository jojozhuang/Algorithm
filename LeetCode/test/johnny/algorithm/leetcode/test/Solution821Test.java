package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution821;

public class Solution821Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestToChar");
        Solution821 instance = new Solution821();

        assertArrayEquals(new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, instance.shortestToChar("loveleetcode", 'e'));
    }
}
