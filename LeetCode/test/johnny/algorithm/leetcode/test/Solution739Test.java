package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution739;

public class Solution739Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("dailyTemperatures");
        Solution739 instance = new Solution739();

        assertArrayEquals(new int[] {1,1,4,2,1,1,0,0}, instance.dailyTemperatures(new int[] {73,74,75,71,69,72,76,73}));
        assertArrayEquals(new int[] {8,1,5,4,3,2,1,1,0,0}, instance.dailyTemperatures(new int[] {89,62,70,58,47,47,46,76,100,70}));
    }
}
