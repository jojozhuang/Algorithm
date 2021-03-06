package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution114Test extends JunitBase {

    @Test
    public void testFlatten() {
        System.out.println("flatten");
        TreeNode root = null;
        Solution114 instance = new Solution114();
        instance.flatten(root);
        assertEquals(null, root);

        TreeNode root2 = new TreeNode(1);
        TreeNode expect2 = TreeNode.createInstance(new String[] {"1","#","#"});
        Solution114 instance2 = new Solution114();
        instance2.flatten(root2);
        assertTrue(TreeNode.isSame(expect2, root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        TreeNode expect3 = TreeNode.createInstance(new String[] {"1","#","2"});
        Solution114 instance3 = new Solution114();
        instance3.flatten(root3);
        assertTrue(TreeNode.isSame(expect3, root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        TreeNode expect4 = TreeNode.createInstance(new String[] {"1","#","2","#","3"});
        Solution114 instance4 = new Solution114();
        instance4.flatten(root4);
        assertTrue(TreeNode.isSame(expect4, root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","5","3","4","6","#"});
        TreeNode expect5 = TreeNode.createInstance(new String[] {"1","#","2","#","3","#","4","#","5","#","6"});
        Solution114 instance5 = new Solution114();
        instance5.flatten(root5);
        assertTrue(TreeNode.isSame(expect5, root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"2","1","4","#","#","3","#"});
        TreeNode expect6 = TreeNode.createInstance(new String[] {"2","#","1","#","4","#","3"});
        Solution114 instance6 = new Solution114();
        instance6.flatten(root6);
        assertTrue(TreeNode.isSame(expect6, root6));
    }
}
