package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution615;

public class Solution615Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution615 instance = new Solution615();

        assertEquals(0, instance.query());
    }
}
