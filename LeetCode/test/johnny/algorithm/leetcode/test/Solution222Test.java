package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution222;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution222Test extends JunitBase {

    @Test
    public void testCountNodes() {
        System.out.println("countNodes");
        Solution222 instance = new Solution222();

        assertEquals(0, instance.countNodes(null));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(2, instance.countNodes(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(3, instance.countNodes(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3","4","#","#","#"});
        assertEquals(4, instance.countNodes(root4));
    }
}
