package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution452Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMinArrowShots");
        Solution452 instance = new Solution452();

        int[][] points1 = new int[][] {{10,16}, {2,8}, {1,6}, {7,12}};
        assertEquals(2, instance.findMinArrowShots(points1));
    }
}
