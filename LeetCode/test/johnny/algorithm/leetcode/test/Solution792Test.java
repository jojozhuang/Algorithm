package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution792;

public class Solution792Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numMatchingSubseq");
        Solution792 instance = new Solution792();

        assertEquals(3, instance.numMatchingSubseq("abcde", new String[] {"a", "bb", "acd", "ace"}));
    }
}
