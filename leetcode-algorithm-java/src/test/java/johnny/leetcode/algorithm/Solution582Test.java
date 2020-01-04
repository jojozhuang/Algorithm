package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution582Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("killProcess");
        Solution582 instance = new Solution582();

        List<Integer> pid1 = ListUtil.buildList(new Integer[] {1, 3, 10, 5});
        List<Integer> ppid1 = ListUtil.buildList(new Integer[] {3, 0, 5, 3});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {5,10});
        assertEquals(expect1, instance.killProcess(pid1, ppid1, 5));
    }
}
