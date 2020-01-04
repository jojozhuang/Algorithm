package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution848Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shiftingLetters");
        Solution848 instance = new Solution848();

        assertEquals("rpl", instance.shiftingLetters("abc", new int[] {3,5,9}));
        assertEquals("abc", instance.shiftingLetters("abc", new int[] {0,0,0}));
        assertEquals("bbc", instance.shiftingLetters("abc", new int[] {1,0,0}));
        assertEquals("jyh", instance.shiftingLetters("bad", new int[] {10,20,30}));
    }
}
