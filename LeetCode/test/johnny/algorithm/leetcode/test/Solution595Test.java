package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution595;

public class Solution595Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution595 instance = new Solution595();

        assertEquals(0, instance.query());
    }
}
