package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution177;

public class Solution177Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution177 instance = new Solution177();

        assertEquals(0, instance.query());
    }
}
