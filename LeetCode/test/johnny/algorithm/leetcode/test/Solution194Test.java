package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution194;

public class Solution194Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Transpose File");
        Solution194 instance = new Solution194();

        assertEquals(0, instance.bash());
    }
}
