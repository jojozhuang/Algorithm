package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution183;

public class Solution183Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution183 instance = new Solution183();

        assertEquals(0, instance.query());
    }
}
