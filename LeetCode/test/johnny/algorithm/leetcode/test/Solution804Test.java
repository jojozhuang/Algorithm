package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution804;

public class Solution804Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniqueMorseRepresentations");
        Solution804 instance = new Solution804();

        assertEquals(2, instance.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
    }
}
