package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution808;

public class Solution808Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("soupServings");
        Solution808 instance = new Solution808();

        assertEquals(0.625, instance.soupServings(50),0.0);
    }
}
