package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution175;

public class Solution175Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution175 instance = new Solution175();

        assertEquals(0, instance.query());
    }
}
