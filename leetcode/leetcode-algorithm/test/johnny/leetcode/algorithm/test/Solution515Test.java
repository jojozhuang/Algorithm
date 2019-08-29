package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution515;
import johnny.leetcode.algorithm.common.ListUtil;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution515Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestValues");
        Solution515 instance = new Solution515();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","3","2","5","3","#","9"});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1, 3, 9});
        assertEquals(expect1, instance.largestValues(root1));
    }
}