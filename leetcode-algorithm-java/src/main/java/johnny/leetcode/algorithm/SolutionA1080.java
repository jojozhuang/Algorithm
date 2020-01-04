package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * 1080. Insufficient Nodes in Root to Leaf Paths
 * Given the root of a binary tree, consider all root to leaf paths: paths from the root to any leaf.  (A leaf is a node with no children.)
 * <p>
 * A node is insufficient if every such root to leaf path intersecting this node has sum strictly less than limit.
 * <p>
 * Delete all insufficient nodes simultaneously, and return the root of the resulting binary tree.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
 * <p>
 * Output: [1,2,3,4,null,null,7,8,9,null,14]
 * Example 2:
 * <p>
 * <p>
 * Input: root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
 * <p>
 * Output: [5,4,8,11,null,17,4,7,null,null,null,5]
 * <p>
 * <p>
 * Example 3:
 * <p>
 * <p>
 * Input: root = [1,2,-3,-5,null,4,null], limit = -1
 * <p>
 * Output: [1,null,-3,4]
 * <p>
 * <p>
 * Note:
 * <p>
 * The given tree will have between 1 and 5000 nodes.
 * -10^5 <= node.val <= 10^5
 * -10^9 <= limit <= 10^9
 *
 * @author Johnny
 */
public class SolutionA1080 {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return null;
    }
}
