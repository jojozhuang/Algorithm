package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution626;

public class Solution626Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution626 instance = new Solution626();

        assertEquals(0, instance.query());
    }
}
