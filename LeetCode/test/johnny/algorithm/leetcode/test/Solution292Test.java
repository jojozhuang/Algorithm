package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution292;

public class Solution292Test extends JunitBase {

    @Test
    public void testCanWinNim() {
        System.out.println("canWinNim");
        Solution292 instance = new Solution292();

        assertEquals(false, instance.canWinNim(0));
        assertEquals(false, instance.canWinNim(4));
        assertEquals(true, instance.canWinNim(3));
    }
}
