package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution305;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution305Test extends JunitBase {

    @Test
    public void testNumIslands2() {
        System.out.println("numIslands2");
        Solution305 instance = new Solution305();

        List<Integer> expect1 = new ArrayList<Integer>();
        assertEquals(expect1, instance.numIslands2(0, 0, null));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1, 1, 2, 3});
        List<Integer> result2 = instance.numIslands2(3, 3, new int[][]{{0,0},{0,1},{1,2},{2,1}});
        assertEquals(expect2, result2);

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {1,2,3,4,3,2,1});
        List<Integer> result3 = instance.numIslands2(3, 3, new int[][]{{0,1},{1,2},{2,1},{1,0},{0,2},{0,0},{1,1}});
        assertEquals(expect3, result3);
    }
}