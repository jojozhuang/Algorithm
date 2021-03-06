package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class Solution251Test extends JunitBase {

    @Test
    public void testNext() {
        System.out.println("next");

        List<List<Integer>> vector1 = ListUtil.buildList2(new Integer[][] {{1,2},{3},{4,5,6}});
        Solution251 instance = new Solution251(vector1);
        int[] expect1 = new int[]{1,2,3,4,5,6};
        int[] result1 = new int[6];
        int i = 0;
        while (instance.hasNext()) {
            result1[i] = instance.next();
            i++;
        }
        assertArrayEquals(expect1, result1);
    }
}
