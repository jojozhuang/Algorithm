package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution184;

public class Solution184Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution184 instance = new Solution184();

        assertEquals(0, instance.query());
    }
}
