package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution207Test extends JunitBase {

    @Test
    public void testCanFinish() {
        System.out.println("canFinish");
        Solution207 instance = new Solution207();

        assertEquals(false, instance.canFinish(0, null));
        assertEquals(true, instance.canFinish(2, new int[][]{{1,0}}));
        assertEquals(false, instance.canFinish(2, new int[][]{{1,0},{0,1}}));
    }
}
